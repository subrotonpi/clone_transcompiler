def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner ( )
        a = sys.stdin.read ( )
        b = sys.stdin.read ( )
        print ( a if a <= b else a - 1 )
