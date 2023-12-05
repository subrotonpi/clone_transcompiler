def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        self.primes = [ 2 , 3 , 5 , 7 , 11 , 13 , 17 , 19 , 23 , 29 , 31 , 37 , 41 , 43 , 47 , 53 , 59 , 61 , 67 , 71 , 73 , 79 , 83 , 89 , 97 ]
        self.factors = [ ]
    def main ( self ) :
        N = sc.randint ( 1 , N )
        for i in range ( 2 , N + 1 ) :
            n = i
            for j in range ( len ( self.primes ) ) :
                if n % self.primes [ j ] == 0 :
                    n /= self.primes [ j ]
                    self.factors [ j ] += 1
                    self.factors [ j ] -= 1
                    if n == 1 :
                        break
        print ( self.f ( 2 , 4 , 4 ) , self.f ( 4 , 2 , 4 ) , self.f ( 4 , 4 , 2 ) , self.g ( 4 , 14 ) , self.g ( 14 , 4 ) , self.g ( 2 , 24 ) , self.g ( 24 , 2 ) , self.h ( 74 ) )
    def f ( self , a , b , c ) :
        ret = 0
        for i in range ( len ( self.primes ) ) :
            for j in range ( i + 1 , len ( self.primes ) ) :
                for k in range ( j + 1 , len ( self.primes ) ) :
                    if self.factors [ i ] >= a and self.factors [ j ] >= b and self.factors [ k ] >= c :
                        ret += 1
        return ret
    def g ( self , a , b ) :
        ret = 0
        for i in range ( len ( self.primes ) ) :
            if self.primes [ i ] >= a and self.primes [ i ] >= b :
                ret += 1
        return ret
    def h ( self ) :
        ret = 0
        for i in range ( len ( self.primes ) ) :
            if self.primes [ i ] >= a and self.primes [ i ] >= b :
                ret += 1
        return ret
        