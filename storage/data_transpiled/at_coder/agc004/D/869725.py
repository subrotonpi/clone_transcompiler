def _import ( ) : return int ( next ( ) )
import sys
import os
import time
import random
import sys
eof = False
def dfs ( v , p ) :
    depth = 0
    for u in g [ v ] :
        if u == p :
            continue
        depth = max ( depth , dfs ( u , v ) + 1 )
    if depth == k - 1 :
        b [ v ] = 0
        return - 1
    return depth
def solve ( ) :
    n = randint ( 1 , k )
    a = [ randint ( 0 , n - 1 ) for i in range ( n ) ]
    b = a + [ 0 ] * n
    g = [ [ ] for i in range ( n ) ]
    for i in range ( 1 , n ) :
        g [ b [ i ] ].append ( i )
    dfs ( 0 , - 1 )
    ret = 0
    for i in range ( n ) :
        if a [ i ] != b [ i ] :
            ret += 1
    print ( ret )
def solve ( ) :
    f = sys.stdin
    out = sys.stdout
    t = threading.Thread ( None , ( solve , ) , "lul" , 1 << 26 )
    t.start ( )
    try :
        t.join ( )
    except KeyboardInterrupt :
        pass
    out.close ( )
def main ( ) :
    sys.stdin = sys.stdout
    sys.stdout = sys.__stdout__
    while not eof or not next ( ) :
        try :
            next ( f )
        except StopIteration :
            eof = True
            return None
    return next ( )
return main
