def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        op = sys.stdin.read ( ).decode ( )
        b = sys.stdin.read ( ).decode ( )
        ans = ( a + b if op == '+' else a - b )
        print ( ans )
