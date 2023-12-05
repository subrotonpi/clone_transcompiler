def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = int ( sc.readline ( ) )
        a = int ( sc.readline ( ) )
        nums = [ int ( i ) for i in sc.readline ( ).split ( ) ]
        max = 1
        for i in range ( n ) :
            nums.append ( int ( sc.readline ( ) ) )
            if max < nums [ i ] :
                max = nums [ i ]
        dp = [ [ 0 for i in range ( n + 1 ) ] for j in range ( n * max + 1 ) ]
        for i in range ( n + 1 ) :
            for j in range ( n * max + 1 ) :
                dp [ 0 ] [ i ] [ j ] = 0
                dp [ i ] [ 0 ] [ j ] = 0
        for i in range ( n + 1 ) :
            dp [ i ] [ 0 ] [ 0 ] = 1
        for k in range ( n * max + 1 ) :
            for j in range ( 1 , n + 1 ) :
                for i in range ( 1 , n + 1 ) :
                    if i < j :
                        dp [ i ] [ j ] [ k ] = 0
                    else :
                        dp [ i ] [ j ] [ k ] = dp [ i - 1 ] [ j ] [ k ]
                        if k - nums [ i - 1 ] >= 0 :
                            dp [ i ] [ j ] [ k ] += dp [ i - 1 ] [ j - 1 ] [ k - nums [ i - 1 ] ]
        ret = 0
        for i in range ( 1 , n + 1 ) :
            ret += dp [ n ] [ i ] [ i * a ]
        print ( ret )
        sc.close ( )
