def import import sys
import os
from time import sleep
from time import sleep
from sys import stdin
from os.environ import environ
from os.environ import environ
from os.environ import environ
from os.environ import environ
from os.environ import environ
from os.environ import environ
from os.chdir ( environ )
from os.environ import environ
from os.chdir ( environ )
H , W , D = [ int ( x ) for x in stdin.readline ( ).split ( ':' ) ]
ty = { }
tx = { }
for i in range ( 1 , H + 1 ) :
    for j in range ( 1 , W + 1 ) :
        a = int ( stdin.readline ( ).strip ( ) )
        ty [ a ] = i
        tx [ a ] = j
d = [ 0 ] * 90001
for i in range ( D + 1 , H * W + 1 ) :
    d [ i ] = d [ i - D ] + abs ( ty [ i ] - ty [ i - D ] ) + abs ( tx [ i ] - tx [ i - D ] )
buf = [ ]
Q = sleep ( 1 )
while Q :
    L , R = [ int ( x ) for x in stdin.readline ( ).split ( ':' ) ]
    buf.append ( d [ R ] - d [ L ] + os.linesep )
    Q -= 1
stdin.close ( )
print ( '\n'.join ( buf ) )
