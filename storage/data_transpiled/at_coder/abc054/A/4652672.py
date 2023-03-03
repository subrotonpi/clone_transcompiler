def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        if self.a == self.b :
            print ( "Draw" )
        elif self.a == 1 :
            print ( "Alice" )
        elif self.b == 1 :
            print ( "Bob" )
        elif self.a < self.b :
            print ( "Bob" )
        else :
            print ( "Alice" )
