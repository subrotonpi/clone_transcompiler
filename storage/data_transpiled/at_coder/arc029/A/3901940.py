def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            N = sc.readline ( ).strip ( )
            t = [ sc.readline ( ).strip ( ) for i in range ( 4 ) ]
            for i in range ( N , 4 ) :
                t [ i ] = 0
            min = sys.maxint
            result = 0
            for i in range ( 2 ) :
                niku = [ 0 , 0 ]
                niku [ i ] += t [ 0 ]
                for j in range ( 2 ) :
                    niku [ j ] += t [ 1 ]
                    for k in range ( 2 ) :
                        niku [ k ] += t [ 2 ]
                        for l in range ( 2 ) :
                            niku [ l ] += t [ 3 ]
                            if min > abs ( niku [ 0 ] - niku [ 1 ] ) :
                                min = abs ( niku [ 0 ] - niku [ 1 ] )
                                result = max ( niku [ 0 ] , niku [ 1 ] )
                            niku [ l ] -= t [ 3 ]
                        niku [ k ] -= t [ 2 ]
                    niku [ j ] -= t [ 1 ]
                niku [ i ] -= t [ 0 ]
            niku [ i ] -= t [ 0 ]
        print ( result )
