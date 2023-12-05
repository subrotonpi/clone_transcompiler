def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( )
    def __str__ ( self ) :
        S = self.s.split ( ',' )
        print ( "%s" % S [ 0 ] )
        print ( " " * 2 )
        print ( S [ 1 ] )
        print ( S [ 2 ] )
