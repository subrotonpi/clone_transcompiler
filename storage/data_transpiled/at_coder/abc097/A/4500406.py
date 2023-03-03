def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.A = sys.stdin.read ( )
        self.B = sys.stdin.read ( )
        self.C = sys.stdin.read ( )
        self.D = sys.stdin.read ( )
        if self.D >= abs ( A - C ) or ( self.D >= abs ( A - B ) and self.D >= abs ( B - C ) ) :
            print ( "Yes" )
        else :
            print ( "No" )
