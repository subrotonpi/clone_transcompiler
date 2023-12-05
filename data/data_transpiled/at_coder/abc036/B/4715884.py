def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.N = self.sc.count ( )
        s = [ s.split ( ' ' ) [ 0 ] for s in self.sc.split ( ' ' ) ]
        for i in range ( self.N ) :
            for j in range ( self.N - 1 , - 1 , - 1 ) :
                print ( s [ j ] , end = ' ' )
            print ( )
