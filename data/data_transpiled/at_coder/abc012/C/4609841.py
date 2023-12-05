def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        n = 2025 - self.sc
        for i in range ( 1 , 10 ) :
            if n % i == 0 and n / i < 10 :
                print ( "{} x {}".format ( i , n / i ) )
