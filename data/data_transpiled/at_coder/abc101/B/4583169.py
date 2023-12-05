def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = int ( sys.argv [ 1 ] )
        def __call__ ( self ) :
            if self.n % S ( self.n ) == 0 :
                ans = "Yes"
            else :
                ans = "No"
            print ( ans )
        def S ( self ) :
            ans = 0
            while self.n > 0 :
                ans += self.n % 10
                self.n /= 10
            return ans
    return Main ( )
