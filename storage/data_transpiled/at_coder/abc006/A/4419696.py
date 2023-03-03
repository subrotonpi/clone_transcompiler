def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.input = sys.stdin.read ( )
        if self.input % 3 == 0 :
            print ( "YES" )
        else :
            print ( "NO" )
