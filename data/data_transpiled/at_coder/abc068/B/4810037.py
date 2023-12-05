def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.main = Main ( )
            with self.open ( '/proc/self/solve.txt' ) as sc :
                self.solve ( sc )
        def solve ( self ) :
            N = self.N
            k = 0
            if N == 0 :
                print ( 0 )
            elif N == 1 :
                print ( 1 )
            elif N > 1 and N <= 3 :
                print ( 2 )
            elif N > 3 and N <= 7 :
                print ( 4 )
            elif N > 7 and N <= 15 :
                print ( 8 )
            elif N > 15 and N <= 31 :
                print ( 16 )
            elif N > 31 and N <= 63 :
                print ( 32 )
            elif N > 63 and N <= 100 :
                print ( 64 )
