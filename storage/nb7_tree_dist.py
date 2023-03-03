import pandas as pd
import xml.etree.ElementTree as ET
import os, sys
import difflib
import ctypes
import stat
from pylibsrcml import srcml
from zss import simple_distance, Node
import zss
import subprocess


dr = '~/PycharmProjects/code-trans-aug/storage/'


def get_xml_tree(code, dir='/home/egk204/PycharmProjects/code-trans-aug/storage'):
    def forc(j_path, c):
        f = open(j_path, "w")
        f.write(c)
        f.close()
    j_path = dir+'/temp/temp_td.java'
    xml_path = dir+'/temp/temp_td.java.xml'

    try:
        forc(j_path, code)
        r = subprocess.run(['srcml', j_path,'-o',xml_path], timeout=5)      
    except subprocess.TimeoutExpired as e:
        forc(j_path,'')
        r = subprocess.run(['srcml', j_path,'-o',xml_path], timeout=5) 
    tree = ET.parse(xml_path)
    rt = tree.getroot()      
    return rt


def rem(s):
    return str(s.tag).replace("{http://www.srcML.org/srcML/src}","")  

def get_avg_root_to_leaf_dist(current_node, tree_paths=[], val=0):           
    #process current node
    token = rem(current_node)
    val+=1

    if token != 'unit' :
        #special case, for current node, attribute, literal value should be added as children to make each path distinct
        cattr = current_node.attrib
        ctoken = current_node.text  
        if bool(cattr):
            for _, token_ in cattr.items():
                val+=1#"-"+token_                
        if bool(ctoken):
            val+=1#"-"+ctoken
    #visit all children            
    for child in current_node:   
        get_avg_root_to_leaf_dist(child, tree_paths, val)
    tree_paths.append(val)
    
    #root_to_leaf_dist = [len(i.split('-')) for i in tree_paths]
    return sum(tree_paths)/len(tree_paths)


def get_dist_for_all(df):
    x = []
    c=0
    for ind, row in df.iterrows():
        c+=1
        if c%10==0:
            print('processed', c)
        rt = get_xml_tree(row.code)
        d = get_avg_root_to_leaf_dist(rt)
        x.append([row.id, d, row.task])
       
    print('done with distances...')
    return pd.DataFrame(x, columns=['id', 'dist', 'task'])


a = pd.read_pickle(dr+'alternative/codes_alt.pkl')#.sample(1)
a = a[a.language_extension=='java']

q= 76220/2
org = a[a.id<=q]
alt_trans = a[a.id>q]


o = pd.read_pickle(dr+'dataset_large/codes.pkl')#.sample(1)
o=o[o.language_extension=='java']
trans=o[o.is_translated==1]

org = get_dist_for_all(org)
org.to_csv('distnces_org.csv')
print("done...1")

trans = get_dist_for_all(trans)
trans.to_csv('distnces_trans.csv')
print("done...2")

alt = get_dist_for_all(alt_trans)
alt.to_csv('distnces_alt_trans.csv')
print("done...3")