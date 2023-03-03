def import import os , sys , getopt
from os import urandom
from random import randint
from itertools import chain
from itertools import chain
n = len ( urandom ( ) )
seen = set ( )
for i in range ( n ) :
    a = randint ( 1 , n )
    if a in seen :
        seen.remove ( a )
    else :
        seen.add ( a )
os.chdir ( os.path.join ( os.path.dirname ( __file__ ) , '..' , 'data' ) )
print ( len ( seen ) )
