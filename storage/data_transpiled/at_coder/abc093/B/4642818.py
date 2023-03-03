def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.A = sys.stdin.read ( )
        self.B = sys.stdin.read ( )
        self.K = sys.stdin.read ( )
    def run ( self ) :
        for i in range ( A , A + K ) :
            if i <= B :
                print ( i )
        for i in range ( B - K + 1 , B + 1 ) :
            if i >= A + K :
                print ( i )
