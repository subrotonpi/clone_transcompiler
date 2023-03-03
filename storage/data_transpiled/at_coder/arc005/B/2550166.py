def import import sys , traceback
import os
import sys
import getopt
import sys
debug = False
debug2 = False
f = open ( '/proc/self/debug' , 'r' )
ia = f.read ( ).split ( )
x , y = map ( int , ia [ 0 ].split ( ':' ) )
dx , dy = 0 , 0
if 'L' in ia [ 2 ] :
    dx = - 1
elif 'R' in ia [ 2 ] :
    dx = 1
if 'U' in ia [ 2 ] :
    dy = - 1
elif 'D' in ia [ 2 ] :
    dy = 1
c = [ ]
for line in f :
    c.append ( line.split ( ) )
for i in range ( 4 ) :
    print ( c [ y ] [ x ] , end = ' ' )
    tx = x + dx
    ty = y + dy
    if tx < 0 or 9 <= tx :
        dx *= - 1
    if ty < 0 or 9 <= ty :
        dy *= - 1
    x += dx
    y += dy
print ( )
