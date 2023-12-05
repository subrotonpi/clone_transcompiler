def _import ( ) : return int ( next ( ) )
import sys
import random
import sys
from time import sleep
from time import sleep
P = 1_000_000_007
def solve ( ) :
    n = randint ( 0 , 10000 )
    dp = [ 1 , 0 , 0 ]
    inv = [ 1 ] * ( n + 7 )
    inv [ 1 ] = 1
    for x in inv [ 2 : ] :
        inv [ x ] = P - int ( long ( P / x ) * inv [ P % x ] % P )
    coef = 1
    ret = 0
    for k in range ( 1 , n + 1 ) :
        nxt = [ 0 ] * 3
        for j1 in range ( 3 ) :
            for j2 in range ( 3 ) :
                if j1 != j2 :
                    nxt [ j2 ] += dp [ j1 ]
                    if nxt [ j2 ] >= P :
                        nxt [ j2 ] -= P
        dp = nxt
        coef = int ( long ( coef ) * ( n - k + 1 ) % P * inv [ k ] % P )
        ways = int ( long ( dp [ 1 ] ) * coef % P )
        delta = int ( long ( inv [ 3 ] ) * inv [ n ] % P * inv [ k ] % P * ways % P )
        ret += delta
    ret %= P
    for i in range ( 1 , n ) :
        ret = ret * inv [ 3 ] % P
    print ( ret )
    def inp ( ) :
        sys.stdin.close ( )
        sys.stdout.flush ( )
    def __next__ ( ) :
        while not sys.stdin.readline ( ) or not sys.stdin.readline ( ) :
            try :
                sys.stdin.readline ( )
            except :
                eof = True
                return None
        return sys.stdin.readline ( )
    next ( )
    next ( )
    try :
        next ( )
    except StopIteration :
        return None
