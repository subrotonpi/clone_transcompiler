def import import sys
class Main ( object ) :
    INF = 10000
    def __init__ ( self ) :
        self.INF = INF
    def __call__ ( self , n , f , a1 , a2 , b1 , b2 , c ) :
        self.n = n
        self.f = f
        self.a1 = a1
        self.a2 = a2
        self.b1 = b1
        self.b2 = b2
        self.c = c
        self.ans = sys.maxint
        for i in range ( 0 , n ) :
            j = 0
            if ( n - i ) * c - f - a2 * i > 0 :
                j = ( ( n - i ) * c - f - a2 * i ) / ( b2 + c ) + 1
            self.ans = min ( self.ans , a1 * i + b1 * j )
        print ( self.ans )
