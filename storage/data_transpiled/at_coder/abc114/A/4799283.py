def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.x = sys.argv [ 1 ]
        if self.x in [ 3 , 5 , 7 ] :
            print ( "YES" )
        else :
            print ( "NO" )
