model = keras.models.load_model('CLCDSA_'+ds+'_Model')
#read dor_test_Dx
#evaluate 
y_pred = np.array((loaded_model([X1, X2]) > 0.5))

for i in range(0,10):
    print('%s %s => %d (expected %d))' % (X1[i].tolist(), X2[i].tolist(), predictions[i], y[i]))