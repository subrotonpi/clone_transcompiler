def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        x = self.sc.read ( )
        if x in [ 7 , 5 , 3 ] :
            print ( "YES" )
        else :
            print ( "NO" )
