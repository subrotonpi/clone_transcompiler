def _import ( * args ) : return _import ( * args )
from itertools import repeat
from random import randint
from itertools import chain
def _import solver
def _solver ( ) :
    sc = iter ( args )
    n = sc.__next__ ( )
    k = sc.__next__ ( )
    a = [ ]
    sum = [ ( i > 0 ) + a [ i ] for i in range ( n ) ]
    if sum [ n - 1 ] == k :
        print ( 1 )
        return
    INF = sum [ n - 1 ] / 3
    f = [ [ INF ] * n for i in range ( n ) ]
    f [ 0 ] [ 0 ] = 1
    for i in range ( 1 , n ) :
        for j in range ( n ) :
            f [ i ] [ j ] = min ( f [ i ] [ j ] , f [ i - 1 ] [ j ] )
    for j in range ( 1 , n ) :
        if f [ i - 1 ] [ j - 1 ] == INF :
            continue
        x = f [ i - 1 ] [ j - 1 ] * sum [ i ] / sum [ i - 1 ] + 1
        while f [ i - 1 ] [ j - 1 ] * sum [ i ] >= x * sum [ i - 1 ] :
            x += 1
        if x - f [ i - 1 ] [ j - 1 ] <= a [ i ] :
            f [ i ] [ j ] = min ( f [ i ] [ j ] , x )
    ans = 0
    for i in range ( n ) :
        if f [ n - 1 ] [ i ] <= k :
            ans = max ( ans , i + 1 )
    print ( ans )
