def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.data = sys.stdin.read ( )
        if self.data [ 0 ] == '9' or self.data [ 1 ] == '9' :
            self.print ( "Yes" )
        else :
            self.print ( "No" )
