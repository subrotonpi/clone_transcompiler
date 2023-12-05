def _import ( ) :
    from itertools import product , repeat
    from itertools import product , repeat
    class Main ( object ) :
        def __init__ ( self , a , b ) :
            self.a = a
            self.b = b
        def run ( self ) :
            sc = product ( [ a , b ] , repeat = repeat )
            k = sc.__next__ ( )
            m = sc.__next__ ( )
            as = [ ]
            for i in range ( k - 1 , - 1 , - 1 ) :
                as.append ( sc.__next__ ( ) )
            for i in range ( k ) :
                for j in range ( i ) :
                    v2 [ i ] ^= v [ j ]
            return v2
        def readline ( self ) :
            while not self.a or not self.b :
                self.a = [ ]
            return self.a
        def readline ( self ) :
            while self.a :
                self.a.append ( sc.__next__ ( ) )
            return self.a
        def readline ( self ) :
            for i in range ( k ) :
                for j in range ( i ) :
                    self.a [ i ] ^= a [ i ] & b [ j ]
            return self.a [ 0 ]
        def solve ( self ) :
            if self.m <= k :
                print ( self.as [ k - m ] )
                return
            doubling = [ [ ] for i in range ( 31 ) ]
            for i in range ( k ) :
                doubling [ 0 ] [ 0 ] [ i ] = cs [ i ]
            for i in range ( 1 , k ) :
                doubling [ 0 ] [ i ] [ i - 1 ] = ( 1 << 32 ) - 1
            for i in range ( 1 , 31 ) :
                doubling [ i ] = multiplyMatrices ( doubling [ i - 1 ] , doubling [ i - 1 ] )
            m -= self.k
            print ( multiply ( self.dfs ( m , doubling ) , self.as ) [ 0 ] )
        def dfs ( self , n , doubling ) :
            if self.n == n :
                return doubling [ 0 ]
            l = 1
            power =