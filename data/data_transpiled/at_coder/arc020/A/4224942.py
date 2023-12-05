def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        a = abs ( self.sc.read ( ) )
        b = abs ( self.sc.read ( ) )
        if a < b :
            print ( "Ant" )
        elif a > b :
            print ( "Bug" )
        else :
            print ( "Draw" )
