def main ( ) : return
import sys
import time
import random
import sys
INF = 1000000000
def solve ( ) :
    n = random.randint ( 1 , 1000000 )
    a = [ random.randint ( 1 , 1000000 ) for _ in range ( 1 << n ) ]
    c = [ ]
    d = [ ]
    for i in range ( ( 1 << n ) - 1 ) :
        c.append ( random.randint ( 1 , 1000000 ) )
    for i in range ( 1 , n ) :
        k = 1 << i
        m = 3 * k - 1
        mm = 3 * ( 1 << ( i - 1 ) )
        for t in range ( k , mm ) :
            tt = c [ t ]
            c [ t ] = c [ m - t ]
            c [ m - t ] = tt
    p = [ [ INF ] * n + [ 0 ] for n in range ( 1 , n + 1 ) ]
    ll = 1 << n
    for i in range ( ( 1 << n ) ) :
        for j in range ( 0 , n ) :
            if a [ i ] >= j :
                p [ i + ll ] [ j ] = 0
            else :
                p [ i + ll ] [ j ] = INF
    for i in range ( ll - 1 , 1 , - 1 ) :
        for j in range ( n ) :
            p [ i ] [ j ] = min ( INF , min ( p [ 2 * i ] [ j + 1 ] + p [ 2 * i + 1 ] [ j + 1 ] , c [ i ] + p [ 2 * i ] [ j ] + p [ 2 * i + 1 ] [ j ] ) )
    print ( p [ 1 ] [ 0 ] )
def solve ( ) :
    f = open ( 'input.txt' , 'w' )
    _ = f.read ( )
    f.write ( 'Case #%d: ' % ( _ ) )
    solve ( )
    f.close ( )
