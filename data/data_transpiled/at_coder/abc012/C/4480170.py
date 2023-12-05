def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.n = int ( self.sc )
        self.N = 2025 - self.n
        for i in range ( 1 , 9 ) :
            for j in range ( 1 , 9 ) :
                if i * j == self.N :
                    print ( "{} x {}".format ( i , j ) )
