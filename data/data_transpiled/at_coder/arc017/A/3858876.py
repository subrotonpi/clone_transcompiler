def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
        self.N = self.Scanner.__next__ ( )
        for i in range ( 2 , self.N * i + 1 ) :
            if self.N % i == 0 :
                self.Print ( "NO" )
                return
        self.Print ( "YES" )
