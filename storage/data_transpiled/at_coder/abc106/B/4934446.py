def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        count = 0
        for i in range ( 105 , n + 1 , 2 ) :
            if self.nb_divisors ( i ) == 8 :
                count += 1
        print ( count )
    def nb_divisors ( n ) :
        c = 0
        for i in range ( 1 , n + 1 ) :
            if n % i == 0 :
                c += 1
        return c
