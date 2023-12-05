def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.w , cnt = 0 , 0
        n , s , t = self.sc.n , self.s , self.t
        for i in range ( n ) :
            w += self.sc.w
            if s <= w <= t :
                cnt += 1
        print ( cnt )
