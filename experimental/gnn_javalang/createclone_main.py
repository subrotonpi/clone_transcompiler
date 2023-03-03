import sys
sys.path.append("~/PycharmProjects/code-clone-multilingual/")
import os
import random
import javalang
import javalang.tree
import javalang.ast
import javalang.util
from javalang.ast import Node
import torch
import sys
from anytree import AnyNode, RenderTree
#import treelib
from anytree import find
from createclone_java import getedge_nextsib,getedge_flow,getedge_nextstmt,getedge_nexttoken,getedge_nextuse
import pandas as pd
def get_token(node):
    token = ''
    #print(isinstance(node, Node))
    #print(type(node))
    if isinstance(node, str):
        token = node
    elif isinstance(node, set):
        token = 'Modifier'
    elif isinstance(node, Node):
        token = node.__class__.__name__
    #print(node.__class__.__name__,str(node))
    #print(node.__class__.__name__, node)
    return token
def get_child(root):
    #print(root)
    if isinstance(root, Node):
        children = root.children
    elif isinstance(root, set):
        children = list(root)
    else:
        children = []

    def expand(nested_list):
        for item in nested_list:
            if isinstance(item, list):
                for sub_item in expand(item):
                    #print(sub_item)
                    yield sub_item
            elif item:
                #print(item)
                yield item
    return list(expand(children))
def get_sequence(node, sequence):
    token, children = get_token(node), get_child(node)
    sequence.append(token)
    #print(len(sequence), token)
    for child in children:
        get_sequence(child, sequence)

def getnodes(node,nodelist):
    nodelist.append(node)
    children = get_child(node)
    for child in children:
        getnodes(child,nodelist)

def createtree(root,node,nodelist,parent=None):
    id = len(nodelist)
    #print(id)
    token, children = get_token(node), get_child(node)
    if id==0:
        root.token=token
        root.data=node
    else:
        newnode=AnyNode(id=id,token=token,data=node,parent=parent)
    nodelist.append(node)
    for child in children:
        if id==0:
            createtree(root,child, nodelist, parent=root)
        else:
            createtree(root,child, nodelist, parent=newnode)
def getnodeandedge_astonly(node,nodeindexlist,vocabdict,src,tgt):
    token=node.token
    nodeindexlist.append([vocabdict[token]])
    for child in node.children:
        src.append(node.id)
        tgt.append(child.id)
        src.append(child.id)
        tgt.append(node.id)
        getnodeandedge_astonly(child,nodeindexlist,vocabdict,src,tgt)
def getnodeandedge(node,nodeindexlist,vocabdict,src,tgt,edgetype):
    token=node.token
    nodeindexlist.append([vocabdict[token]])
    for child in node.children:
        src.append(node.id)
        tgt.append(child.id)
        edgetype.append([0])
        src.append(child.id)
        tgt.append(node.id)
        edgetype.append([0])
        getnodeandedge(child,nodeindexlist,vocabdict,src,tgt,edgetype)

def countnodes(node,ifcount,whilecount,forcount,blockcount):
    token=node.token
    if token=='IfStatement':
        ifcount+=1
    if token=='WhileStatement':
        whilecount+=1
    if token=='ForStatement':
        forcount+=1
    if token=='BlockStatement':
        blockcount+=1
    print(ifcount,whilecount,forcount,blockcount)
    for child in node.children:
        countnodes(child,ifcount,whilecount,forcount,blockcount)

'''
def getedge_nextsib(node,vocabdict,src,tgt,edgetype):
    token=node.token
    for i in range(len(node.children)-1):
        src.append(node.children[i].id)
        tgt.append(node.children[i+1].id)
        edgetype.append([1])
        src.append(node.children[i+1].id)
        tgt.append(node.children[i].id)
        edgetype.append([1])
    for child in node.children:
        getedge_nextsib(child,vocabdict,src,tgt,edgetype)
'''

import pandas as pd
def helper(df, code_dict):
    for i in range(len(df)):
        if df.iloc[i]['is_parsable']==1:
            id_ = df.iloc[i]['id']
            code_ = df.iloc[i]['code']
            code_dict[id_] = code_
            print(id_ )
    return code_dict
def get_code_fragments_dictionary():
    code_dict = {}
    d = '~/PycharmProjects/code-clone-multilingual/'
    original = pd.read_pickle(d+'storage/data_original.pkl')
    original = original[original['language_extension']=='java']
    trans = pd.read_pickle(d+'storage/data_transpiled.pkl')
    trans = trans[trans['language_extension']=='java']
    aug = pd.read_pickle(d+'storage/augmented_gmn_parsable.pkl')
    
    for df in [original, trans, aug]:
        code_dict = helper(df, code_dict)
    return code_dict
    
    

def createast():
    import pandas as pd
    import sys
    sys.path.append('~/PycharmProjects/code-clone-multilingual/')
    code_fragments = get_code_fragments_dictionary()    
    asts=[]
    paths=[]
    alltokens=[]
 
    for uid, fragment in code_fragments.items():
        text=fragment
        try:
            programtokens = javalang.tokenizer.tokenize(text)
            parser = javalang.parse.Parser(programtokens)
            programast = parser.parse_member_declaration()
        except:
            try:
                programtokens = javalang.tokenizer.tokenize(text)
                programast = javalang.parser.parse(programtokens)
            except:
                print('could not parse!', uid, text[:10])
                continue
        paths.append(uid)
        asts.append(programast)
        get_sequence(programast,alltokens)
        
    astdict=dict(zip(paths,asts))
    ifcount=0
    whilecount=0
    forcount=0
    blockcount=0
    docount = 0
    switchcount = 0
    for token in alltokens:
        if token=='IfStatement':
            ifcount+=1
        if token=='WhileStatement':
            whilecount+=1
        if token=='ForStatement':
            forcount+=1
        if token=='BlockStatement':
            blockcount+=1
        if token=='DoStatement':
            docount+=1
        if token=='SwitchStatement':
            switchcount+=1
    print(ifcount,whilecount,forcount,blockcount,docount,switchcount)
    print('allnodes ',len(alltokens))
    alltokens=list(set(alltokens))
    vocabsize = len(alltokens)
    tokenids = range(vocabsize)
    vocabdict = dict(zip(alltokens, tokenids))
    print(vocabsize)
    return astdict,vocabsize,vocabdict

def createseparategraph(astdict,vocablen,vocabdict,device,mode='astonly',nextsib=False,ifedge=False,whileedge=False,foredge=False,blockedge=False,nexttoken=False,nextuse=False):
    pathlist=[]
    treelist=[]
    print('nextsib ',nextsib)
    print('ifedge ',ifedge)
    print('whileedge ',whileedge)
    print('foredge ',foredge)
    print('blockedge ',blockedge)
    print('nexttoken', nexttoken)
    print('nextuse ',nextuse)
    print(len(astdict))
    for path,tree in astdict.items():
        #print(tree)
        #print(path)
        nodelist = []
        newtree=AnyNode(id=0,token=None,data=None)
        createtree(newtree, tree, nodelist)
        #print(path)
        #print(newtree)
        x = [] #nodeindexlist
        edgesrc = []
        edgetgt = []
        edge_attr=[]
        if mode=='astonly':
            getnodeandedge_astonly(newtree, x, vocabdict, edgesrc, edgetgt)
        else:
            getnodeandedge(newtree, x, vocabdict, edgesrc, edgetgt,edge_attr)
            if nextsib==True:
                getedge_nextsib(newtree,vocabdict,edgesrc,edgetgt,edge_attr)
            getedge_flow(newtree,vocabdict,edgesrc,edgetgt,edge_attr,ifedge,whileedge,foredge)
            if blockedge==True:
                getedge_nextstmt(newtree,vocabdict,edgesrc,edgetgt,edge_attr)
            tokenlist=[]
            if nexttoken==True:
                getedge_nexttoken(newtree,vocabdict,edgesrc,edgetgt,edge_attr,tokenlist)
            variabledict={}
            if nextuse==True:
                getedge_nextuse(newtree,vocabdict,edgesrc,edgetgt,edge_attr,variabledict)
        #x = torch.tensor(x, dtype=torch.long, device=device)
        edge_index=[edgesrc, edgetgt]
        #edge_index = torch.tensor([edgesrc, edgetgt], dtype=torch.long, device=device)
        astlength=len(x)
        #print(x)
        #print(edge_index)
        #print(edge_attr)
        pathlist.append(path)
        treelist.append([[x,edge_index,edge_attr],astlength])
        astdict[path]=[[x,edge_index,edge_attr],astlength]
    #treedict=dict(zip(pathlist,treelist))
    #print(totalif,totalwhile,totalfor,totalblock)
    return astdict
def creategmndata(id,treedict,vocablen,vocabdict,device):

    #read clones and non_clones pair info
    #clones = pd.read_csv('~/PycharmProjects/code-clone-multilingual/storage/pairs/gmn_clones.csv', names=['id1','id2','label'])
    #non_clones = pd.read_csv('~/PycharmProjects/code-clone-multilingual/storage/pairs/gmn_non_clones_first.csv', names=['id1','id2','label'])
    #clone_pairs = pd.read_csv('~/PycharmProjects/code-clone-multilingual/storage/pairs/gmn_augmented_dataset.csv', names=['id1','id2','label'])#clones.append(non_clones)
    #X = clone_pairs[['id1', 'id2']]
    #y = clone_pairs['label']
    import pandas as pd
    storage_dir = '~/PycharmProjects/code-clone-multilingual/storage/pairs/'
    c1 = pd.read_csv(storage_dir+'gmn_clones.csv', names=['id1','id2','label'])
    nc1 = pd.read_csv(storage_dir+'gmn_non_clones_first.csv',names=['id1','id2','label'])
    c2= pd.read_csv(storage_dir+'gmn_aug_clones.csv', names=['id1','id2','label'])
    nc2 = pd.read_csv(storage_dir+'gmn_aug_non_clones_sample.csv', names=['id1','id2','label'])
    
    clone_pairs = c1.append(nc1)
    clone_pairs = clone_pairs.append(c2)
    clone_pairs = clone_pairs.append(nc2)

    clone_pairs['label'] = clone_pairs['label'].replace(0, -1)
    data = clone_pairs#.sample(100) #remove sample....
    data_num = len(data)
    ratios = [6,2,2]#int(r) for r in self.ratio.split(':')]
    train_split = int(ratios[0] / sum(ratios) * data_num)
    val_split = train_split + int(ratios[1] / sum(ratios) * data_num)

    data = data.sample(frac=1, random_state=666)
    trainlist = data.iloc[:train_split]
    validlist = data.iloc[train_split:val_split]
    testlist = data.iloc[val_split:]
    print(len(trainlist), len(validlist), len(testlist))
    '''
    if id=='0':
        trainfile = open(indexdir+'traindata.txt')
        validfile = open(indexdir+'devdata.txt')
        testfile = open(indexdir+'testdata.txt')
    elif id=='11':
        trainfile = open(indexdir+'traindata11.txt')
        validfile = open(indexdir+'devdata.txt')
        testfile = open(indexdir+'testdata.txt')
    else:
        print('file not exist')
        quit()
    trainlist=trainfile.readlines()
    validlist=validfile.readlines()
    testlist=testfile.readlines()'''
    '''
    trainlist=pd.read_pickle('./scb/traindata_id.pkl')
    testlist=pd.read_pickle('./scb/testdata_id.pkl')
    validlist=pd.read_pickle('./scb/devdata_id.pkl')'''

    print('train data')
    traindata=createpairdata(treedict,trainlist,device=device)

    print('valid data')
    validdata=createpairdata(treedict,validlist,device=device)
    print('test data')
    testdata=createpairdata(treedict,testlist,device=device)
    return traindata, validdata, testdata
def createpairdata(treedict,pathlist,device):
    '''
    print('create pair')
    datalist=[]
    countlines=1
    skip=0;
    for i in range(0, len(pathlist)):
        if len(pathlist[i])<3:
            print(i,len(pathlist[i]), pathlist[i], 'here')
    for line in pathlist:
       # print(countlines, line)
        countlines += 1

        pairinfo = line.split()

        if(len(pairinfo)<3):
           skip+=1
           print('skipped', skip)
           continue

        #print(len(pairinfo))
        code1path=#'scb'+pairinfo[0].strip('.')
        code2path=#'scb'+pairinfo[1].strip('.')

        label=int(pairinfo[2])'''
    f = pathlist#pd.read_pickle('./scb/traindata_id.pkl')
    datalist=[]
    for row in range(len(f)):
        code1path = f.iloc[row]['id1']  # 'scb'+pairinfo[0].strip('.')
        code2path = f.iloc[row]['id2']
        label = f.iloc[row]['label']
        #print(label)
        data1 = treedict[code1path]
        data2 = treedict[code2path]
        x1,edge_index1,edge_attr1,ast1length=data1[0][0],data1[0][1],data1[0][2],data1[1]
        x2,edge_index2,edge_attr2,ast2length=data2[0][0],data2[0][1],data2[0][2],data2[1]
        if edge_attr1==[]:
            edge_attr1 = None
            edge_attr2 = None
        data = [[x1, x2, edge_index1, edge_index2, edge_attr1, edge_attr2], label]
        datalist.append(data)
    return datalist

if __name__ == '__main__':
    astdict, vocabsize, vocabdict=createast()
    treedict=createseparategraph(astdict, vocabsize, vocabdict,device='cpu',mode='else',nextsib=True,ifedge=True,whileedge=True,foredge=True,blockedge=True,nexttoken=True,nextuse=True)
    #creategmndata(treedict,vocabsize,vocabdict,device='cpu')