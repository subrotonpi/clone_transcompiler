def _import ( ) :
    import math
    import numpy
    from numpy.core import get_lis
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            n = sc.readline ( ).strip ( )
            x = [ sc.readline ( ).strip ( ) for i in range ( n ) ]
            print ( n - get_lis ( n , x ) )
        def get_lis ( self , n , a ) :
            dp = [ 0 ] * ( n + 1 )
            dp [ 0 ] = 1
            for i in range ( n ) :
                dp [ i ] = 1
                for j in range ( i ) :
                    if a [ j ] < a [ i ] :
                        dp [ i ] = max ( dp [ i ] , dp [ j ] + 1 )
            ans = max ( ans , dp [ i ] )
    return Main
