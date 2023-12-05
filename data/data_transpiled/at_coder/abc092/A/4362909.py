def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.A = sys.stdin.read ( )
        self.B = sys.stdin.read ( )
        self.C = sys.stdin.read ( )
        self.D = sys.stdin.read ( )
        print ( min ( A , B ) , min ( C , D ) )
