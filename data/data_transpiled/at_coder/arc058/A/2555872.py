def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.read ( )
        K = sc.read ( )
        A = [ True ] * 10
        for i in range ( K ) :
            D = sc.read ( )
            A [ D ] = True
        for i in range ( N ) :
            if self.check ( i , A , K ) :
                print ( i )
                return
    def check ( self , N , A , K ) :
        while N > 0 :
            if A [ N % 10 ] :
                return False
            N /= 10
        return True
