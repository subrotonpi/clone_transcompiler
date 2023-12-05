def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        x = sys.stdin.read ( )
        num = 0
        while x > 0 :
            num += 1
            x -= 2
        print ( num )
