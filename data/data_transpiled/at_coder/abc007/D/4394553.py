def _ _ main _ _ ( ) :
    import sys
    import math
    import random
    class Main ( object ) :
        def __init__ ( self , * args , ** kwargs ) :
            Scanner ( ).__init__ ( self )
            A = random.randint ( - 1 , 1 )
            B = random.randint ( - 1 , 1 )
            a = [ ]
            b = [ ]
            for i in range ( 19 ) :
                a.append ( int ( A % 10 ) )
                b.append ( int ( B % 10 ) )
                A //= 10
                B //= 10
            self.out.append ( c ( b ) - c ( a ) )
        def c ( self ) :
            dp = [ [ 0 , 0 , 0 ] ]
            for i in range ( 19 ) :
                for j in range ( 2 ) :
                    x = 9 if j == 1 else a [ i ]
                    for k in range ( 2 ) :
                        for l in range ( 0 , x ) :
                            dp [ i + 1 ] [ j == 1 or l < x ] += dp [ i ] [ j ] [ k ]
        return dp [ 19 ] [ 0 ] [ 1 ] + dp [ 19 ] [ 1 ] [ 1 ]
