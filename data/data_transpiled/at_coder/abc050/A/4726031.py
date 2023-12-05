def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        op = self.a.decode ( )
        self.b = sys.stdin.read ( )
        if op == '+' :
            print ( a + b )
        else :
            print ( a - b )
