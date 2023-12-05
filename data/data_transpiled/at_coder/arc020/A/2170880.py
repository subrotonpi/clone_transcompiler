def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
        a = abs ( int ( self.Scanner.start ( ) ) )
        b = abs ( int ( self.Scanner.stop ( ) ) )
        if a < b :
            print ( "Ant" )
        elif a > b :
            print ( "Bug" )
        else :
            print ( "Draw" )
