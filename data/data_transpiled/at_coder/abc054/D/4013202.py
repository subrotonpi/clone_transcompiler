def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = int ( sc.readline ( ) )
        Ma = int ( sc.readline ( ) )
        Mb = int ( sc.readline ( ) )
        a = [ int ( i ) for i in sc.readline ( ).split ( ' ' ) ]
        b = [ int ( i ) for i in sc.readline ( ).split ( ' ' ) ]
        c = [ int ( i ) for i in sc.readline ( ).split ( ' ' ) ]
        dp = [ [ 0 for i in range ( N + 1 ) ] for j in range ( 499 ) ]
        dp [ 0 ] [ 0 ] = 0
        for i in range ( N ) :
            for j in range ( 400 ) :
                for k in range ( 400 ) :
                    dp [ i + 1 ] [ j + a [ i ] ] [ k + b [ i ] ] = min ( dp [ i + 1 ] [ j + a [ i ] ] [ k + b [ i ] ] , dp [ i ] [ j ] [ k ] + c [ i ] )
                    dp [ i + 1 ] [ j ] [ k ] = min ( dp [ i + 1 ] [ j ] [ k ] , dp [ i ] [ j ] [ k ] )
        min = sys.maxsize / 2
        for i in range ( 1 , 400 ) :
            for j in range ( 1 , 400 ) :
                if Ma * j == Mb * i and dp [ N ] [ i ] [ j ] != sys.maxsize :
                    min = min ( min , dp [ N ] [ i ] [ j ] )
        if min == sys.maxsize / 2 :
            print ( - 1 )
        else :
            print ( min )
