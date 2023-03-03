def import import sys , os , sys , traceback
from time import sleep
from random import randint
from random import uniform
from os import urandom
from os import fdopen
from os import fdopen
from os.path import expanduser
from os.path import join
from os import urandom
from os.environ import dict
from os import environ
from os import environ as environ
from os import chdir
from os.environ import environ
from os import chdir
w = int ( environ [ 'LINES_NO_LINES' ] )
h = int ( environ [ 'LINES_NO_LINES' ] )
dx = [ int ( environ [ 'LINES_NO_LINES' ] ) ]
dy = [ int ( environ [ 'LINES_NO_LINES' ] ) ]
a = urandom ( 1 )
b = urandom ( 1 )
g = zeros ( ( w , h ) )
xx = [ ]
yy = [ ]
f = 0
l = 1
xx.append ( a )
yy.append ( b )
g [ a ] = True
v = 0
while f < l :
    x = xx [ f ]
    y = yy [ f ]
    v += 1
    for i in range ( 2 ) :
        if x + dx [ i ] >= 0 and x + dx [ i ] < w and y + dy [ i ] >= 0 and y + dy [ i ] < h and not g [ x + dx [ i ] ] [ y + dy [ i ] ] :
            g [ x + dx [ i ] ] [ y + dy [ i ] ] = True
            xx.append ( x + dx [ i ] )
            yy.append ( y + dy [ i ] )
            l += 1
    f += 1
