def main ( ) :
    import sys
    from random import randint
    from numpy import array
    from numpy.testing import assert_almost_equal
    class Main ( object ) :
        def __init__ ( self ) :
            self.solve = [ ]
        def solve ( self ) :
            with open ( self.filename , 'r' ) as f :
                n = int ( f.read ( ) )
                A = [ randint ( 0 , n ) for i in range ( n ) ]
                A.sort ( )
        def solve ( self ) :
            sum = [ A [ 0 ] ]
            for i in range ( 1 , n ) :
                sum [ i ] = sum [ i - 1 ] + A [ i ]
            res = 1
            for i in range ( n - 1 , 1 , - 1 ) :
                if A [ i ] <= 2 * sum [ i - 1 ] :
                    res += 1
                else :
                    break
            return res
    return Main ( )
