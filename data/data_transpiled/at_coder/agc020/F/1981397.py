def _import ( ) :
    import sys
    import random
    import math
    import math
    class Main ( int ) :
        def solve ( self , a , p , c ) :
            n = len ( a )
            dp = [ [ 1 << ( n - 1 ) ] * c * n + 1 ]
            dp [ 0 ] [ n * a [ n - 1 ] ] = 1
            for i in range ( c * n ) :
                for mask in ( 1 << ( n - 1 ) ) - 1 :
                    for ok in range ( i , c * n ) :
                        if dp [ mask ] [ ok ] == 0 :
                            continue
                        if i % n != 0 :
                            who = p [ i % n - 1 ]
                            if not test ( mask , who ) :
                                dp [ mask | ( 1 << who ) ] [ min ( max ( ok , i + n * a [ who ] ) , c * n ) ] += dp [ mask ] [ ok ]
            return dp [ ( 1 << ( n - 1 ) ) - 1 ] [ c * n ]
        def test ( mask , i ) :
            return ( ( mask >> i ) & 1 ) == 1
        def submit ( self ) :
            n , c = randint ( 1 , c )
            a = [ randint ( 0 , c * n ) for i in range ( n ) ]
            a.sort ( )
            p = [ i for i in range ( n - 1 ) ]
            good = 0
            total = 0
            one = math.pow ( c , n - 1 ).intbv ( ) [ 0 ]
            while True :
                good += solve ( self , a , p , c )
                total += one
                if next_permutation ( p ) :
                    self.write ( 1.0 * good / total )
    def next_permutation ( a ) :
        n , ptr = a.shape
        while ptr > 0 and a [ ptr - 1 ] >= a [ ptr ] :
            ptr -= 1
        return a [ ptr - 1 ]
    return Main ( )
