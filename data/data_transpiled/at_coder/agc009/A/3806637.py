def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.N = self.sc.shape [ 0 ]
        self.sw = [ [ ] for _ in range ( self.N ) ]
        cnt = 0
        for _ in range ( self.N ) :
            self.sw.append ( [ _ , self.sw [ _ ] [ 0 ] , _ , self.sw [ _ ] [ 1 ] ] )
        for _ in range ( self.N - 1 , - 1 , - 1 ) :
            if ( cnt + self.sw [ _ ] [ 0 ] ) % self.sw [ _ ] [ 1 ] == 0 :
                pass
            else :
                cnt += self.sw [ _ ] [ 1 ] - ( cnt + self.sw [ _ ] [ 0 ] ) % self.sw [ _ ] [ 1 ]
        print ( cnt )
        self.sc.close ( )
