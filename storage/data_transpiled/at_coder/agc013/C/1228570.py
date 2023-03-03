def import import os , sys , traceback
from time import sleep
from random import randint
from time import time as sleep
from random import choice
from os import urandom
from os import urandom
from random import choice
from random import random
from random import seed
from random import seed
from random import seed
from random import seed
from random import seed
from random import seed
from random import seed
from random import seed
from random import seed
from random import seed
from random import seed
from random import seed
from random import seed
from random import seed
from random import seed
from random import seed
from random import seed
from random import seed
seed ( seed )
N = randint ( 1 , N )
L = seed ( )
T = seed ( )
x = [ ]
w = [ ]
cw = [ ]
ccw = [ ]
for i in range ( N ) :
    x.append ( randint ( 1 , N ) )
    w.append ( randint ( 1 , N ) == 1 )
    if w [ i ] :
        cw.append ( x [ i ] )
    else :
        ccw.append ( x [ i ] )
    cw.reverse ( )
    if len ( cw ) == 0 or len ( ccw ) == 0 :
        for i in range ( N ) :
            print ( ( x [ i ] + ( w [ i ] % L ) ) % L )
    else :
        pos = [ int ( ( x [ i ] + ( w [ i ] % L ) ) % L ) for i in range ( N ) ]
        pos.sort ( )
        cnt = 0
        for ccwx in ccw :
            dis = ( ccwx - cw [ 0 ] + L ) % L
            cnt = ( cnt + ( 2 * T + L - dis - 1 ) / L ) % N
        a = bisect ( pos , int ( ( cw [ 0 ] + T ) % L ) )
        if a > 0 and pos [ a - 1 ] == pos [ a ] :
            a -= 1
        cidx = ( a - bisect ( pos , x ) - int ( cnt + N + N ) ) % N
        for i in range ( N ) :
            print ( ( x [ cidx ] + cw [ i ] ) % L )
    