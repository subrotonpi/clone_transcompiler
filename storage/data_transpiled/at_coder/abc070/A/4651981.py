def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        x = self.sc.read ( )
        if x % 10 == x / 100 :
            print ( "Yes" )
        else :
            print ( "No" )
