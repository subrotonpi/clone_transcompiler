def main ( ) :
    import sys
    from numpy.testing import assert_equal
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            N = ( self.sc.readline ( ) + 1 ) // 2
            self.print ( N )
