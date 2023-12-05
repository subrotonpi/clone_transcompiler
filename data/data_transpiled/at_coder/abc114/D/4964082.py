def main ( ) :
    import sys
    import random
    import sys
    from random import randint
    primes = [ 2 , 3 , 5 , 7 , 11 , 13 , 17 , 19 , 23 , 29 , 31 , 37 , 41 , 43 , 47 , 53 , 59 , 61 , 67 , 71 , 73 , 79 , 83 , 89 , 97 ]
    class PrimeFactorizater :
        def __init__ ( self , max ) :
            pass
        def getprime ( self , num ) :
            counts = [ 0 ] * len ( primes )
            for prime in primes :
                while True :
                    if num % prime == 0 :
                        counts [ prime ] += 1
                        num = num // prime
                    else :
                        break
            return counts
        def solve ( self ) :
            with open ( "input.txt" , "r" ) as f :
                N = f.read ( )
                f.close ( )
    pf = PrimeFactorizater ( N )
    primes_count = [ 0 ] * len ( primes )
    for i in range ( 1 , N + 1 ) :
        pft_ret = pf.getprime ( i )
        for j in pft_ret :
            primes_count [ j ] += 1
    use_count = [ 0 ] * len ( primes_count )
    result = count ( primes_count , use_count , 0 )
    print ( result )
    def count ( self , primes_count , use_count , pos ) :
        ret = 0
        pattern = self.getpattern ( use_count )
        if pattern == 75 :
            return 1
        elif pattern > 75 :
            return 0
        if pos >= len ( self.primes_count ) :
            return 0
        for i in range ( 0 , self.primes_count [ pos ] ) :
            use_count [ pos ] = i
            ret += count ( self , use_count , pos + 1 )
        use_count [ pos ] = 0
        return ret
    def getpattern ( use_count ) :
        pattern = 1
        for i in range ( self.primes_count [ pos ] ) :
            pattern *= i + 1
        return pattern
    return solve
