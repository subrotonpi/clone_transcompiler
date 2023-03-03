def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.data = self.data.split ( '-' )
        if len ( self.data ) == 2 :
            if self.data [ 0 ] == a and self.data [ 1 ] == b :
                self.success = True
            else :
                self.success = False
        else :
            self.success = False
