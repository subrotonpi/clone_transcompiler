def import import os , sys , traceback
from time import sleep
from random import randint
from random import seed
from time import time as clock
from random import seed
from os import urandom
from os import urandom
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
N = seed
L = seed
T = seed
x = [ seed ( seed ) for seed in seed ]
cw = [ seed ( seed ) == seed ( seed ) ]
pos = [ seed ( x ) for seed in seed ( N ) ]
for i in range ( N ) :
    pos.append ( int ( ( x [ i ] + ( T % L if cw else L - ( T % L ) ) ) ) % L )
pos.sort ( )
cnt = 0
for i in range ( 1 , N ) :
    if cw [ i ] != cw [ 0 ] :
        dis = ( ( x [ i ] - x [ 0 ] ) * ( cw [ 0 ] or 1 ) + L ) % L
        cnt = ( cnt + ( 2 * T + L - dis - 1 ) / L ) % N
a = bisect.bisect ( pos , int ( ( x [ 0 ] + ( T % L ) * ( cw [ 0 ] or 1 ) ) + L ) )
if cw [ 0 ] and a > 0 and pos [ a - 1 ] == pos [ a ] : a -= 1
if not cw [ 0 ] and a < N - 1 and pos [ a + 1 ] == pos [ a ] : a += 1
idx = int ( ( a + cnt * ( cw [ 0 ] or - 1 ) + N ) % N )
for i in range ( N ) :
    sys.stdout.write ( pos [ ( idx + i ) % N ] )
