def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sn = sys.stdin
        a = self.sn.read ( )
        b = self.sn.read ( )
        if a > b :
            print ( a )
        else :
            print ( b )
