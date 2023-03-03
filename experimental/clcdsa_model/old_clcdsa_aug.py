import os
import tensorflow as tf
import keras.models
import pandas as pd
from keras.models import Model
from keras.optimizers import SGD
from keras.layers import Dense, Dropout, Input, concatenate, Activation
from keras import backend as K
from keras.utils.generic_utils import get_custom_objects
from customize import SingleConnected
import numpy as np
from numpy import loadtxt
from sklearn.metrics import classification_report

class SiameseModel:
    def __init__(self):
        #export LD_LIBRARY_PATH=$LD_LIBRARY_PATH:$CONDA_PREFIX/lib/
        #export CUDA_VISIBLE_DEVICES=1
        #os.environ["CUDA_DEVICE_ORDER"] = "PCI_BUS_ID"
        #os.environ["CUDA_VISIBLE_DEVICES"] = "GPU:0"
        # GPU enabled for
        sess = tf.compat.v1.Session(config=tf.compat.v1.ConfigProto(log_device_placement=True))
        K.clear_session()
        K.set_session(sess)
        self.dataset = dataset
        get_custom_objects().update({'activation': Activation(self.custom_activation)})

    @tf.keras.utils.register_keras_serializable()
    def custom_activation(self, x):
        return 1 / (1 + tf.exp(-tf.reduce_sum(x, axis=-1, keepdims=True)))

    def build_model(self, shape = 9):

        # first initialization layer
        model1_Input = Input(shape=(shape,))
        model1_hidden1 = Dense(100, activation='relu', kernel_initializer='he_normal')(model1_Input)
        model1_dropout1 = Dropout(0.2)(model1_hidden1)
        model1_hidden2 = Dense(100, activation='relu', kernel_initializer='he_normal')(model1_dropout1)
        model1_output = Dropout(0.2)(model1_hidden2)


        # second Initialization layer
        model2_Input = Input(shape=(shape,))
        model2_hidden1 = Dense(100, activation='relu', kernel_initializer='he_normal')(model2_Input)
        model2_dropout1 = Dropout(0.2)(model2_hidden1)
        model2_hidden2 = Dense(100, activation='relu', kernel_initializer='he_normal')(model2_dropout1)
        model2_output = Dropout(0.2)(model2_hidden2)

        # Comparator model
        merged_model = concatenate([model1_output, model2_output])
        comparator_layer1 = Dense(100, activation='relu', kernel_initializer='he_normal')(merged_model)
        comparator_layer1_Dropout = Dropout(0.2)(comparator_layer1)
        comparator_layer2 = Dense(50, activation='relu', kernel_initializer='he_normal')(comparator_layer1_Dropout)
        comparator_layer2_Dropout = Dropout(0.2)(comparator_layer2)
        comparator_layer3 = Dense(10, activation='relu', kernel_initializer='he_normal')(comparator_layer2_Dropout)
        comparator_layer3_Dropout = Dropout(0.2)(comparator_layer3)
        compilation_layer = SingleConnected()(comparator_layer3_Dropout)
        final_output = Dense(1, activation='sigmoid')(compilation_layer)

        model = Model(inputs=[model1_Input, model2_Input], outputs=final_output)
        return model

if __name__ == "__main__":
    ds = 'org_and_augmented'#'dataset_original_first.csv'
    expr_dir = '/home/egk204/Documents/code-clone-multilingual/experimental/'
    
    dor = pd.read_csv(expr_dir+'data/dataset_original_sixth.csv').sample(frac=1)
    daug = pd.read_csv(expr_dir+'data/dataset_augmented_sixth.csv').sample(frac=1)
    
    data_num = len(dor)
    ratios = [7,3] #int(r) for r in self.ratio.split(':')]
    train_split = int(ratios[0] / sum(ratios) * data_num) #val_split = train_split + int(ratios[1] / sum(ratios) * data_num)
    dor_train = dor.iloc[:train_split]
    dor_test = dor.iloc[train_split:]
    dor_test.to_csv(expr_dir+'data/dor_test_Dx.csv', index=None)
    dor_test=dor_test.to_numpy()
    
    #for testing
    X1_test = dor_test[:, 0:9]
    X2_test = dor_test[:, 9:18] 
    y_test = dor_test[:, 18] 
    
    #merge
    dataset = dor_train.append(daug)
    dataset = dataset.sample(frac=1).to_numpy() #randomizing
    #for training
    X1 = dataset[:, 0:9]
    X2 = dataset[:, 9:18]
    y = dataset[:, 18]
    print(np.shape(dataset), np.shape(X1), np.shape(X2), np.shape(y))
    with tf.device("gpu:0"):
        print("tf.keras code in this scope will run on GPU")
        #create model
        si_model = SiameseModel()
        model = si_model.build_model()
        optimizer = SGD(learning_rate=0.0001, decay=0.03)
        model.compile(loss='binary_crossentropy', optimizer=optimizer, metrics=['accuracy'])
        
        #train model
        model.fit([X1, X2], y, epochs=150, batch_size=1000)
        _, accuracy = model.evaluate([X1, X2], y)
        print('Accuracy on Dx training set: %.2f' % (accuracy * 100))
        #save model    
        model.save(expr_dir+'saved_models/CLCDSA_'+ds+'_Model'+'.h5')
        model.save(expr_dir+'saved_models/CLCDSA_'+ds+'_Model')
        print("Model Saved to disk")
        
        print('testing on original 20%\n===========================')
        _, accuracy = model.evaluate([X1_test, X2_test], y_test)
        print('Accuracy on orignal dataset: %.2f' % (accuracy * 100))
        
        y_preds = (model([X1_test, X2_test]) > 0.5)
        y_preds = np.array(y_preds)
        print(classification_report(y_test, y_preds))
        
        #load saved model and test
        '''
        loaded_model = keras.models.load_model('CLCDSA_'+ds+'_Model')
        predictions = np.array((loaded_model([X1, X2]) > 0.5))
        for i in range(0,10):
            print('%s %s => %d (expected %d))' % (X1[i].tolist(), X2[i].tolist(), predictions[i], y[i]))
            '''
            