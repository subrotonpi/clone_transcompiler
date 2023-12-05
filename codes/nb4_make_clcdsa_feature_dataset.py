import sys
sys.path.append("~/PycharmProjects/code-trans-aug/")
import pandas as pd
storage_dir = '~/PycharmProjects/code-trans-aug/storage/'
sv_dir = '~/PycharmProjects/code-trans-aug/storage/dataset/'

def feats_to_dict(dft, feats_dict):
    for row in range(len(dft)):
        key = int(dft.iloc[row]['id'])
        value = list(dft.iloc[row,:9])
        #print(key, value)
        feats_dict[key] = value
    return feats_dict
def get_antlr_feature_dictionary(storage_dir = storage_dir):
    column_names = ['variable', 'arguments', 'operators', 'expressions', 'loops','operands', 'exceptions', 'exception_clause', 'mccable_complex', 'file_path', 'problem_class','id']

    # load features 
    ojf = pd.read_csv(storage_dir+'feat_original/java_features_pc_id.csv', names=column_names)
    opf = pd.read_csv(storage_dir+'feat_original/python_features_pc_id.csv', names=column_names)
    tjf = pd.read_csv(storage_dir+'feat_trans/java_features_pc_id.csv', names=column_names)
    tpf = pd.read_csv(storage_dir+'feat_trans/python_features_pc_id.csv', names=column_names)
    
    #verify unique IDs
    a = len(ojf['id'])+len(opf['id'])+len(tjf['id'])+len(tpf['id'])#len of individual
    b = len(set(ojf['id']).union(set(opf['id']), set(tjf['id']), set(tpf['id']))) # len of all set union
    if a==b:
        print('verified unique IDs', a, b)
     
    #generate dict   
    feats_dict = {}
    feats_dfs = [ojf, opf, tjf, tpf]
    for dft in feats_dfs:
        feats_dict = feats_to_dict(dft, feats_dict)
        
    print('features dict len:',len(feats_dict))
    #for k, v in feats_dict.items():
    #    print(type(k), type(v))
    return feats_dict

def get_dataset(df, data_dict):
    print('printing data shape, data_dict length',df.shape, len(data_dict))
    dataset = []
    #for df in [clones, non_clones]:
    for ind in range (len(df)):
        row = list(df.iloc[ind,:])
        x1 = data_dict.get(row[0])
        x2 =  data_dict.get(row[1])
        label = row[2] 
        dataset.append(x1+x2+[label])

    
    return pd.DataFrame(dataset)

if __name__ == "__main__":
    fd = get_antlr_feature_dictionary()
    print(len(list(dict.keys(fd))) == len(set(dict.keys(fd))))

    pairs = pd.read_csv(sv_dir+'dataset_org.csv', header=None)
    dset = get_dataset(pairs, fd)
    dset.to_csv(sv_dir+'ft_dset_original_clcdsa.csv', header=None, index=False)
    
    pairs = pd.read_csv(sv_dir+'dataset_or_80_20_aug.csv', header=None)
    dset = get_dataset(pairs, fd)
    dset.to_csv(sv_dir+'ft_dset_augmented_clcdsa.csv', header=None, index=False)