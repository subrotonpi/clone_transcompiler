def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.ans = b - a
        if a < 0 and b > 0 :
            self.ans -= 1
        print ( self.ans )
