def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
        self.k = sys.maxint
        if self.n >= 2 ** self.k :
            print ( "YES" )
        else :
            print ( "NO" )
