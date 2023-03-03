def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        op = sys.stdin.read ( )
        b = sys.stdin.read ( )
        if op == '+' :
            print ( a + b )
        else :
            print ( a - b )
