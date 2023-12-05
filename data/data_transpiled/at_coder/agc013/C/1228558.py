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
N = seed ( )
L = seed ( )
T = seed ( )
x = [ ]
w = [ ]
cw = [ ]
ccw = [ ]
for i in range ( N ) :
    x.append ( randint ( 0 , N ) )
    w.append ( randint ( 0 , N ) == 1 )
    if w [ i ] :
        cw.append ( x [ i ] )
    else :
        ccw.append ( x [ i ] )
cw.reverse ( )
if len ( cw ) == 0 or len ( ccw ) == 0 :
    for i in range ( N ) :
        print ( ( x [ i ] + ( w [ i ] % L ) ) % L )
else :
    pos = [ int ( i ) for i in range ( N ) ]
    pos.sort ( )
    cnt = 0
    for ccwx in ccw :
        dis = ( ccwx - cw [ 0 ] + L ) % L
        cnt = ( cnt + ( 2 * T + L - dis ) / L ) % N
    cidx = ( bisect.bisect_right ( pos , ( int ( ( cw [ 0 ] + T ) % L ) ) - bisect.bisect_left ( x , cw [ 0 ] ) - int ( cnt + N + N ) ) % N )
    for i in range ( N ) :
        print ( pos [ ( cidx + i ) % N ] )
sys.exit ( 1 )
