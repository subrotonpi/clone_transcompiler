def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.A = sys.stdin.read ( )
        self.B = sys.stdin.read ( )
        self.C = sys.stdin.read ( )
        self.D = sys.stdin.read ( )
    def run ( self ) :
        self.A = sys.stdin.read ( )
        self.B = sys.stdin.read ( )
        self.C = sys.stdin.read ( )
        self.D = sys.stdin.read ( )
        self.ab = None
        self.cd = None
        if self.A < B :
            ab = A
        else :
            ab = B
        if self.C < D :
            cd = C
        else :
            cd = D
        print ( self.ab , self.cd )
