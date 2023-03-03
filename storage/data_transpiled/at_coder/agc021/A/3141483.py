def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = sys.maxint
            self.N = self.N
            self.N = self.solve ( N )
            print ( self.N )
        def help ( self ) :
            ans = 0
            while self.N > 0 :
                ans += self.N % 10
                self.N = self.N / 10
            return ans
        def help ( self ) :
            if self.N < 10 :
                return int ( self.N )
            s = str ( self.N )
            s = s.split ( '.' )
            ans = self.help ( self.N )
            for i in range ( 2 , len ( s ) + 1 ) :
                temp = long ( pow ( 10 , i - 1 ) )
                cur = self.N / temp - 1
                ans = max ( ans , self.help ( cur ) + 9 * ( i - 1 ) )
            return ans
    return Main ( )
