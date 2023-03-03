def _import ( ) :
    import sys
    import random
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            self.primes = [ 2 , 3 , 5 , 7 , 11 , 13 , 17 , 19 , 23 , 29 , 31 , 37 , 41 , 43 , 47 , 53 , 59 , 61 , 67 , 71 , 73 , 79 , 83 , 89 , 97 ]
        def __init__ ( self , max ) :
            self.primes = [ 1 ]
        def get_prime_count ( num ) :
            counts = [ 0 ] * len ( self.primes )
            for prime in self.primes :
                while 1 :
                    if num % prime == 0 :
                        counts [ prime ] += 1
                        num = num // prime
                    else :
                        break
            return counts
        def solve ( self ) :
            f = open ( "/proc/" , "r" )
            N = f.read ( )
            f.close ( )
            pf = PrimeFactorizater ( N )
            primes_count = [ 0 ] * len ( self.primes )
            for i in range ( 1 , N + 1 ) :
                pft_ret = pf.get_prime_count ( i )
                for j in pft_ret :
                    primes_count [ j ] += 1
            use_count = [ 0 ] * len ( self.primes )
            result = count ( self.primes , use_count , 0 )
            print ( result )
        def debug_print ( use_count ) :
            str = ""
            for i in use_count :
                if i > 0 :
                    str += "%s^%s * " % ( self.primes [ i ] , i )
            print ( str )
        def count ( self , primes_count , use_count , pos ) :
            ret = 0
            pattern = get_pattern ( use_count , pos )
            if pattern == 75 :
                return 1
            elif pattern > 75 :
                return 0
            return 1
    return Main ( )
