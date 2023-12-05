def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.scn = sys.stdin
        A = self.scn.read ( )
        B = self.scn.read ( )
        C = 0
        if B % A == 0 :
            C = A + B
        else :
            C = B - A
        print ( C , end = ' ' )
