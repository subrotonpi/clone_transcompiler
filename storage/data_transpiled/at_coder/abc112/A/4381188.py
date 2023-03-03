def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.argv.count ( 'N' )
        if self.N == 1 :
            print ( 'Hello World' )
        if self.N == 2 :
            A = sys.stdin.read ( )
            B = sys.stdin.read ( )
            print ( A + B )
