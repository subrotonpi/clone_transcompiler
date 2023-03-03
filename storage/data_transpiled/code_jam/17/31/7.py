def _import ( ) : return time.time ( )
import sys
import sys
import traceback
import os
import sys
import time
import sys
import traceback
import bisect
import random
import sys
def chk ( b ) : return b
print ( traceback.format_exc ( ) )
exit ( 999 )
def deb ( fmt , * args ) :
    print ( '%s' % fmt , args )
def readline ( ) :
    while not os.path.exists ( 'input.txt' ) :
        s = raw_input ( )
    return int ( readline ( ) )
def randint ( n ) :
    return long ( readline ( ) )
def uniform ( n ) :
    return float ( readline ( ) )
def readline ( ) :
    while not os.path.exists ( 'input.txt' ) :
        s = raw_input ( )
    return s
def solve ( ) :
    if os.path.exists ( 'output.txt' ) :
        f = open ( 'input.txt' , 'r' )
    else :
        f = sys.stdin
    out = open ( 'output.txt' , 'w' )
    solve ( )
    f.close ( )
    out.close ( )
def solve ( ) :
    T = randint ( 1 , n )
    for t in range ( T ) :
        n = randint ( 1 , k )
        a = [ P ( randint ( 0 , 1 ) , randint ( 0 , 1 ) ) for i in range ( n ) ]
        d = [ ]
        sort ( a )
        for i in range ( n ) :
            d [ i ] [ 1 ] = pi * a [ i ] [ 1 ] + a [ i ] [ 1 ] * 2.* pi * a [ i ] [ 1 ]
        if i > 0 :
            d [ i ] [ 1 ] = max ( d [ i ] [ 1 ] , d [ i - 1 ] [ 1 ] )
        for j in range ( 2 , k + 1 ) :
            for i in range ( 1 , n ) :
                d [ i ] [ j ] = max ( d [ i - 1 ] [ j ] , d [ i - 1 ] [ j - 1 ] + a [ i ] [ 1 ] *