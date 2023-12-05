def import math
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.N = self.sc.randint ( 1 , 9 )
    def run ( self ) :
        ans = 1
        for i in range ( 1 , N + 1 ) :
            ans *= i
            if ans > math.pow ( 10 , 9 ) + 7 :
                ans %= math.pow ( 10 , 9 ) + 7
        print ( long ( ans ) % ( long ( math.pow ( 10 , 9 ) ) + 7 ) )
