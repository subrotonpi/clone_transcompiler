def import sys , string , traceback ;
from os import urandom
from os import urandom
from sys import stdin as fds
from os.path import join
from os import urandom
from os import urandom
from random import randint
from itertools import chain
H = range ( 0 , sys.maxint )
W = range ( sys.maxint , sys.maxint )
a = [ ]
h = [ ]
w = [ ]
flag = False
for s in stdin.read ( 1 ).split ( '\n' ) :
    flag = False
    for i , j in enumerate ( s ) :
        a.append ( i )
        if a [ i ] [ j ] == '#' : flag = True
    if not flag :
        h.append ( i )
for j in range ( W ) :
    flag = False
    for i in range ( H ) :
        if a [ i ] [ j ] == '#' : flag = True
    if not flag :
        w.append ( j )
for i in range ( H ) :
    flag = False
    for j in range ( W ) :
        if i not in h and j not in w :
            print ( a [ i ] [ j ] , end = ' ' )
            flag = True
    if flag :
        print ( )
