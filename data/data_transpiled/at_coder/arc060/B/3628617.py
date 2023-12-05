def import math
class Main ( object ) :
    def __init__ ( self , n , s ) :
        self.n = n
        self.s = s
        self.n = n
        self.s = s
        self.n = n
        self.s = s
        self.n = n
        self.s = s
        self.n = n
        self.s = s
        if n == s :
            print ( n + 1 )
            return
        for i in range ( 2 , int ( math.sqrt ( n ) + 10 ) ) :
            if self.f ( n , i ) == s :
                print ( i )
                return
        bmin = math.inf
        for i in range ( 1 , int ( math.sqrt ( n ) + 10 ) ) :
            b = ( n - s ) / i + 1
            if b <= 1 :
                continue
            if self.f ( n , b ) == s :
                bmin = min ( b , bmin )
        if bmin == math.inf :
            print ( - 1 )
        else :
            print ( bmin )
    def f ( self , n , b ) :
        ret = 0
        while n != 0 :
            ret += n % b
            n /= b
        return ret
