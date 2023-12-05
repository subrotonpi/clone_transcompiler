def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.x = sys.stdin.read ( )
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        if self.a >= self.b :
            print ( "delicious" )
        elif self.x >= ( self.b - self.a ) :
            print ( "safe" )
        else :
            print ( "dangerous" )
