def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner ( )
        a = sys.stdin.read ( )
        b = sys.stdin.read ( )
        print ( min ( abs ( a - b ) , 10 - abs ( a - b ) ) )
