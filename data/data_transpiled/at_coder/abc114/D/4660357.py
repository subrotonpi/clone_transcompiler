def main ( ) :
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            self.divisors = [ ]
        def __init__ ( self ) :
            sc = sys.stdin
            N = sc.readline ( )
            self.divisors = [ ]
            self.primenumbers_ = self.get_primes ( N )
            self.primenumbers = [ ]
            for i in self.primenumbers_ :
                self.primenumbers.append ( self.occurrences ( i , N ) )
        def two ( self ) :
            self.four = 0
            self.fourteen = 0
            self.twentyfour = 0
            self.seventyfour = 0
            for i in self.primenumbers :
                if i >= 2 :
                    self.two += 1
                if i >= 4 :
                    self.four += 1
                if i >= 14 :
                    self.fourteen += 1
                if i >= 24 :
                    self.twentyfour += 1
                if i >= 74 :
                    self.seventyfour += 1
            t1 = self.twentyfour * ( self.two - 1 )
            t2 = nCr ( self.four , 2 ) * ( self.two - 2 )
            t3 = self.seventyfour
            t4 = self.fourteen * ( self.four - 1 )
            print ( t1 + t2 + t3 + t4 )
        def nCr ( self , n , r ) :
            if r > n :
                return 0
            return factorial ( n , r ) / factorial ( self.n - r , 1 )
        def factorial ( self , n , m ) :
            product = 1
            while n > m :
                product *= n
                n -= 1
            return product
        def occurrences ( self , prime ) :
            self.occurrence = [ prime ]
            for i in range ( 2 , N + 1 ) :
                power = 0
                temp = i
                while temp > 0 and temp % self == 0 :
                    power += 1
                    temp /= self
                self.occurrence += [ i - 1 ] + power
            return self.occurrence
return Main
