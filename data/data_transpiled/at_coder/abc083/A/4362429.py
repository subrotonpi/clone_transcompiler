def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.A = sys.stdin.read ( )
        self.B = sys.stdin.read ( )
        self.C = sys.stdin.read ( )
        self.D = sys.stdin.read ( )
    def run ( self ) :
        L = A + B
        R = C + D
        if L > R :
            print ( "Left" )
        elif L == R :
            print ( "Balanced" )
        else :
            print ( "Right" )
