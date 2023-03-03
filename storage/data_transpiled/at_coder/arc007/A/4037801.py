def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.X = sys.stdin.read ( )
        self.s = sys.stdin.read ( )
        x = self.X [ 0 ]
        for c in self.s :
            if c != x :
                print ( c , end = ' ' )
        print ( )
