def import math
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
        print ( self.calc ( N ) )
    def calc ( x ) :
        primes = [ 1 ] * ( x + 1 )
        primes [ 0 ] = primes [ 1 ] = 0
        for i in range ( 3 , len ( primes ) ) :
            if i % 2 == 0 :
                primes [ i ] = 0
        j = 3
        while j * j < len ( primes ) :
            for k in range ( j + 1 , len ( primes ) ) :
                if k % j == 0 :
                    primes [ k ] = 0
            j += 2
        factors = [ 0 ] * ( x + 1 )
        while x > 1 :
            i = 3
            f = x
            while f % 2 == 0 :
                factors [ 2 ] += 1
                f /= 2
            while i <= f :
                if primes [ i ] == 1 :
                    while f % i == 0 :
                        factors [ i ] += 1
                        f /= i
                i += 2
            if f != 1 :
                factors [ f ] += 1
            x -= 1
        d = long ( math.pow ( 10 , 9 ) ) + 7
        count = 1
        for f in factors :
            if f != 0 :
                count *= ( f + 1 )
            while count >= d :
                count -= d
        return count
    def test ( self ) :
        assert self.calc ( 6 ) == 30
        assert self.calc ( 1000 ) == 972926972
