def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.A = sys.stdin.read ( )
        self.B = sys.stdin.read ( )
        self.K = sys.stdin.read ( )
        min = min ( A , B )
        j = 0
        for i in range ( min , 0 , - 1 ) :
            if A % i == 0 and B % i == 0 :
                j += 1
            if j == K :
                print ( i )
                break
