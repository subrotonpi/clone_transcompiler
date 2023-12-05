def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N , A , B , K = sys.argv [ 1 ] , sys.argv [ 2 ] , sys.argv [ 3 ] , sys.argv [ 4 ]
    def Sc ( ) :
        N = self.N
        A = self.A
        B = self.B
        K = N * A
        if K > B :
            print ( B )
        else :
            print ( K )
