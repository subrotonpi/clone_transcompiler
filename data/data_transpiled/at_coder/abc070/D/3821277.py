def import import os , traceback
from time import sleep
from time import sleep
from time import sleep
from os import system
from os.path import join
from os import environ
from os import environ
from os import chdir
N = int ( environ.get ( 'PATH' , '' ) )
nodes = [ Node ( i ) for i in range ( N ) ]
for i in range ( N - 1 ) :
    a , b , c = environ.get ( 'PATH' , '' ).split ( ':' )
    nodes [ a ].edges.append ( ( nodes [ b ] , c ) )
    nodes [ b ].edges.append ( ( nodes [ a ] , c ) )
Q = int ( environ.get ( 'PATH' , '' ) )
K = int ( environ.get ( 'PATH' , '' ) )
dfs ( nodes [ K ] , 0 )
for i in range ( Q ) :
    x , y = environ.get ( 'PATH' , '' ).split ( ':' )
    print ( nodes [ x ].depth + nodes [ y ].depth )
def dfs ( n , depth ) :
    n.depth = depth
    n.visited = True
    for e in n.edges :
        if not e.to.visited :
            dfs ( e.to , depth + e.dist )
class Node ( object ) :
    id = 0
    visited = False
    edges = [ ]
    depth = 0
    def __init__ ( self , id ) :
        self.id = id
class Edge ( object ) :
    to = 1
    dist = 1
    def __init__ ( self , to = 0 , dist = 1 ) :
        self.to = to
        self.dist = dist
