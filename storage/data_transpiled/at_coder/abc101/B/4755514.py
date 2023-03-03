def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = int ( self.n )
            n2 = self.n
            s = 0
            while 0 < n :
                s += self.n % 10
                self.n = self.n / 10
            if self.n2 % s == 0 :
                print ( "Yes" , end = " " )
            else :
                print ( "No" , end = " " )
