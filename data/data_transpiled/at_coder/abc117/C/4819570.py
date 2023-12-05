def main ( ) :
    import sys
    import numpy
    from numpy.testing import assert_almost_equal
    class Main ( object ) :
        def __init__ ( self ) :
            self.N , self.M = sys.argv [ 1 ] , sys.argv [ 2 ]
            self.points = numpy.array ( numpy.random.rand ( self.N , self.M ) )
        def sample ( self , x ) :
            return numpy.random.rand ( self.N )
    points = [ ]
    for i in range ( M ) :
        points.append ( numpy.random.rand ( self.N ) )
    points.sort ( )
    minus = [ points [ k ] - points [ k - 1 ] for k in range ( 1 , M ) ]
    minus.sort ( )
    ans = 0
    for l in minus [ - N + 1 : ] :
        ans += l
    print ( ans )
