def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sys = sys
        self.sys.argv = [ ]
        self.w = sys.stdin.read ( )
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        print ( 0 if abs ( a - b ) <= w else abs ( a - b ) - w )
