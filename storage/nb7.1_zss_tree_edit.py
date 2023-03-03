import pandas as pd
import xml.etree.ElementTree as ET
import os, sys
import difflib
import ctypes
import stat
from pylibsrcml import srcml

from zss import simple_distance, Node
import zss


dr = '~/PycharmProjects/code-trans-aug/storage/'
def get_xml_tree(code, dir='home/egk204/PycharmProjects/code-trans-aug/storage/'):
    j_path = dir+'/temp/temp1.java'
    xml_path = dir+'/temp/temp1.java.xml'
    f = open(j_path, "w")
    f.write(code)
    f.close()
    srcml.srcml(j_path, xml_path)
    tree = ET.parse(xml_path)   
    return tree.getroot()
def tour_de_tree_zss(current_node, parent_node=None):     
    #process current node
    token = str(current_node.tag).replace("{http://www.srcML.org/srcML/src}","")  

    n = Node(token)
    
    if parent_node==None:
        parent_node = n
        temp_parent = parent_node
    else:
        parent_node.addkid(n)
        temp_parent = zss.Node.get_children(parent_node)[-1]
    
    if token!='unit':
        #special case, for current node, attribute, literal value should be added as children to make each path distinct
        cattr = current_node.attrib
        ctoken = current_node.text  
        if bool(cattr):
            for _, token_ in cattr.items():
                
                n = Node(token_)
                parent_node.addkid(n)
                
        if bool(ctoken):
            n = Node(ctoken)
            parent_node.addkid(n)
                
    #visit all children            
    for child in current_node:
        tour_de_tree_zss(child,temp_parent)
    
            
    return parent_node

def print_zss_tree(n):
    for i in zss.Node.get_children(n):
        print(zss.Node.get_label(i))
        print_zss_tree(i)
        print("----")

def remove_newline(c):
    return c.replace("\n", "")

def get_dist(c1, c2):
    r1 = tour_de_tree_zss(get_xml_tree(c1)) #get zss tree
    r2 = tour_de_tree_zss(get_xml_tree(c2))
    return simple_distance(r1,r2)


def get_zss_distances(d1, d2):
    distances = []
    for t in range(1, 1369):
        def get_group(d):
            return d[d.task==t]     
        g1 = get_group(d1)
        g2 = get_group(d2)
        
        #for each one against another one
        for i, r in g1.iterrows():
            id1 = r.id
            c1 = r.code
            for j, s in g2.iterrows():
                id2 = s.id
                c2 = s.code
                #print(c1,'=====================\n', c2)
                zsd = get_dist(c1, c2)
                distances.append([id1, id2, zsd])
    return pd.DataFrame(distances, columns=['id1', 'id2', 'zss_distance'])


print("*********************************************")
data = pd.read_pickle(dr+'alternative/codes_alt.pkl')
alt_java = data[data.language_extension=='java']
alt_java_or = alt_java[alt_java.id<=19804]
alt_tr = alt_java[alt_java.id>19804]
distances =  get_zss_distances(alt_java_or, alt_tr)
distances.to_csv('distances_alter.csv')
print("*********************************************")

data = pd.read_pickle(dr+'dataset_large/codes.pkl')
org_java = data[data.language_extension=='java']
java_tr = org_java[org_java.is_translated==1]
java_or = org_java[org_java.is_translated==0]

distances =  get_zss_distances(java_tr, java_or)
distances.to_csv('distances_or_tr.csv')
print("*********************************************")