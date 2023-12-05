def import readline
import sys
from os.path import expanduser
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from os import environ
from time import time
from random import randint , random , random
from time import time
from time import sleep
dp = [ [ 1 << 30 , 0 , 0 , 0 , 0 , 0 , 0 ] for i in range ( 2000 ) ]
for i in range ( 0 , len ( dp ) ) :
    dp [ i ] [ r ] = randint ( 0 , 1 << 30 )
for i in range ( 0 , len ( dp ) ) :
    dp [ i ] [ r ] = randint ( 0 , 1 << 30 )
for j in range ( r + g + b - 1 , - 1 , - 1 ) :
    for i in range ( 1 , len ( dp ) ) :
        if j >= g + b :
            dp [ i ] [ j ] = min ( dp [ i - 1 ] [ j ] , abs ( i - 900 ) + dp [ i - 1 ] [ j + 1 ] )
        elif j >= b :
            dp [ i ] [ j ] = min ( dp [ i - 1 ] [ j ] , abs ( i - 1000 ) + dp [ i - 1 ] [ j + 1 ] )
        else :
            dp [ i ] [ j ] = min ( dp [ i - 1 ] [ j ] , abs ( i - 1100 ) + dp [ i - 1 ] [ j + 1 ] )
min = int ( sys.maxsize )
for i in range ( 2000 ) :
    if dp [ i ] [ 0 ] < min :
        min = dp [ i ] [ 0 ]
print ( min )
