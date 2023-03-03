def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.A = sys.stdin.read ( )
        op = sys.stdin.read ( )
        B = sys.stdin.read ( )
        if op == '+' :
            print ( A + B )
        else :
            print ( A - B )
