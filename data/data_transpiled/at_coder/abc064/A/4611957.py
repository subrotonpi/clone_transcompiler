def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
    def run ( self ) :
        x = 100 * a + 10 * b + c
        if x % 4 == 0 :
            print ( "YES" )
        else :
            print ( "NO" )
