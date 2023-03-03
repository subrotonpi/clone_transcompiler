def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.l = sys.stdin.read ( )
        self.h = sys.stdin.read ( )
        self.n = sys.stdin.read ( )
    def run ( self ) :
        for i in range ( self.n ) :
            tmp_a = sys.stdin.read ( )
            print ( tmp_a > h , ( tmp_a < l ) )
