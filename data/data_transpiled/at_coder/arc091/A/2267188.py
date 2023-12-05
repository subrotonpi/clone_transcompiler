def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
        N = Scanner ( ).__next__
        M = Scanner ( ).__next__
        print ( long ( abs ( ( N - 2 ) * ( M - 2 ) ) ) )
