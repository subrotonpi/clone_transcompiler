def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( )
        ma = sc.readline ( )
        mb = sc.readline ( )
        a = [ sc.readline ( ) for i in range ( n ) ]
        b = [ sc.readline ( ) for i in range ( n ) ]
        c = [ sc.readline ( ) for i in range ( n ) ]
        inf = 100000000
        dp = [ [ inf ] * ( n + 1 ) for i in range ( n * 10 + 1 ) ]
        dp [ 0 ] [ 0 ] = 0
        for i in range ( 1 , n + 1 ) :
            for j in range ( n * 10 + 1 ) :
                for k in range ( n * 10 + 1 ) :
                    dp [ i ] [ j ] [ k ] = min ( dp [ i - 1 ] [ j ] [ k ] , dp [ i - 1 ] [ x ] [ y ] + c [ i - 1 ] )
                else :
                    dp [ i ] [ j ] [ k ] = dp [ i - 1 ] [ j ] [ k ]
    candA = ma
    candB = mb
    answer = inf
    while candA <= n * 10 and candB <= n * 10 :
        answer = min ( answer , dp [ n ] [ candA ] [ candB ] )
        candA += ma
        candB += mb
    if answer == inf :
        print ( - 1 )
    else :
        print ( answer )
