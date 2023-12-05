def main ( ) :
    import sys
    import time
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            self.n = sc.randint ( 1 , 10000 )
            self.day = sc.randint ( 1 , 10000 )
            self.x = sc.randint ( 1 , 10000 )
            self.total = 0
            for a in range ( n ) :
                if self.day % a == 0 :
                    self.total += self.day / a
                else :
                    self.total += self.day / a + 1
            self.out.write ( "%d" % self.total )
