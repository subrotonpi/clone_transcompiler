def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.x = sys.stdin.read ( )
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.y = abs ( self.x - self.a )
        self.z = abs ( self.x - self.b )
        if self.y < self.z :
            print ( 'A' , end = '' )
        else :
            print ( 'B' , end = '' )
