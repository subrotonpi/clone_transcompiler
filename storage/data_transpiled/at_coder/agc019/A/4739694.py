def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.q = int ( self.q )
            self.h = int ( self.h )
            self.s = int ( self.s )
            self.d = int ( self.d )
            self.n = int ( self.n )
            self.q *= 4
            self.h *= 2
            self.ans = 0
            if self.n >= 2 :
                self.ans += min ( self.q * 2 , ( min ( self.h * 2 , ( min ( self.s * 2 , self.d ) ) ) ) ) * ( self.n // 2 )
                self.n = self.n - ( self.n // 2 ) * 2
            self.ans += min ( self.q , ( min ( self.h , self.s ) ) ) * self.n
            print ( self.ans )
