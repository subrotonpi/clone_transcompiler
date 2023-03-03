def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = int ( self.n )
            self.k = int ( self.k )
            mod = 1000000007
            self.ans = 1
            for i in range ( self.n - 1 ) :
                self.ans *= self.n - 1 + k - i
                self.ans %= mod
            for i in range ( 2 , self.n - 1 + 1 ) :
                self.pow ( i , self.mod - 2 , self.ans )
            print ( self.ans )
        def pow ( self , h , e , mod ) :
            while e :
                if self.e & 1 == 1 :
                    self.ans *= h
                    self.ans %= mod
                e >>= 1
                self.h *= h
                self.h %= mod
    return Main ( )
