def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( )
    def __call__ ( self , s ) :
        S = s.split ( '' )
        print ( '%s' % S [ 0 ] , end = '' )
        print ( '%d' % ( len ( S ) - 2 ) , end = '' )
        print ( S [ - 1 ] )
