def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.X = sys.stdin.read ( )
        self.A = sys.stdin.read ( )
        self.B = sys.stdin.read ( )
        if self.B - A <= 0 :
            print ( "delicious" )
        elif self.B - A <= X :
            print ( "safe" )
        else :
            print ( "dangerous" )
