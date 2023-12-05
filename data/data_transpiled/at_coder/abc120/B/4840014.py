def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = 1
            self.b = 2
            self.k = 3
            self.n = 0
            for i in range ( 101 , 1 , - 1 ) :
                if self.a % i == 0 and self.b % i == 0 :
                    self.n += 1
                    if self.n == self.k :
                        print ( i )
