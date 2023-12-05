def import import sys
class Main ( object ) :
    def __init__ ( self , sc ) :
        self.n = sc.n
        self.s = sc.s
        if self.n == self.s :
            print ( self.n + 1 )
            return
        if ( self.n + 1 ) // 2 < self.s :
            print ( - 1 )
            return
        for b in range ( 2 , self.n ** 2 + 1 ) :
            if self.f ( self.n , b ) == self.s :
                print ( b )
                return
        min = sys.maxint
        for p in range ( 1 , self.n ** 2 + 1 ) :
            b = ( self.n - self.s ) // p + 1
            if self.f ( self.n , b ) == self.s :
                min = min ( min , b )
        print ( min )
    def f ( self , n , b ) :
        if self.n < b :
            return n
        else :
            return self.f ( self.n // b , b ) + self.n % b
