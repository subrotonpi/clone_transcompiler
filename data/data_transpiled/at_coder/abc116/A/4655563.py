def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.A = sys.stdin.read ( )
        self.B = sys.stdin.read ( )
        self.C = sys.stdin.read ( )
        self.max = max ( self.A , max ( self.B , self.C ) )
        print ( A * self.B * self.C / 2 / self.max )
