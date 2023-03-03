def fla ( p , q ) :
    import random
    import time
    import math
    class x ( int ) :
        def fla ( self , p , q ) :
            ti = 2 * q - p
            tj = 2 * p - q
            if ti % 3 or tj % 3 :
                return 0
            ti /= 3
            tj /= 3
            return 0
    def main ( args ) :
        with open ( args.input , 'r' ) as infile :
            t = int ( infile.read ( ) )
            for tt in range ( 1 , t + 1 ) :
                h , w , r = [ int ( x ) for x in infile.read ( ) ]
                a , b = [ int ( x ) for x in infile.read ( ) ]
                f = [ [ False for x in a ] for a in b ]
                D = [ [ 1 for x in a ] for a in b ]
                D [ 1 ] [ 1 ] = 1
                for i in range ( 2 , h + 1 ) :
                    for j in range ( 2 , w + 1 ) :
                        if not f [ i ] [ j ] :
                            D [ i ] [ j ] += ( D [ i - 2 ] [ j - 1 ] + D [ i - 1 ] [ j - 2 ] ) % 10007
                    print ( "Case #{}: {}".format ( tt , D [ h ] [ w ] ) )
