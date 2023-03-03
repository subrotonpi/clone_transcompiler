def main ( ) :
    import sys
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            self.M = 0
            self.S = [ ]
            self.C = self.stirling ( N )
            self.N = self.N
        def complex ( self ) :
            res = [ ]
            for i in range ( 0 , N ) :
                res.append ( [ 1 if self.M == i else - 1 for self in self.C [ i ] * self.ways ( i ) ] ) % M + ( self.M == 0 )
        return res
    def stirling ( self ) :
        res = [ ]
        for i in range ( 0 , N ) :
            res.append ( [ 0 if self.M == i else 1 for self in self.C [ i ] ] )
            for j in range ( 1 , i ) :
                res [ i ] [ j ] = ( res [ i - 1 ] [ j - 1 ] + int ( j + 1 ) * ( res [ i - 1 ] [ j ] % M ) ) % M
        return res
    def beki ( a , x , mod ) :
        res = 1
        for i in range ( 32 ) :
            if ( ( x >> i ) & 1 ) == 1 :
                res = ( res * a ) % mod
                a = ( a ** 2 ) % mod
        return res
    def ways ( self ) :
        res = 0
        b1 = beki ( 2 , self.N - self.M )
        beki1 = 1
        beki2 = beki ( 2 , self.beki ( 2 , self.N - self.M - 1 ) % ( self.M - 1 ) , self.M )
        for j in range ( 0 , i ) :
            res = ( res + ways2 ( self.N , self.M - self.M ) ) % M
            beki1 = ( beki1 * b1 ) % M
        return res
    def ways ( self ) :
        res = 0
        for i in range ( 0 , i ) :
            res = ( res + ways ( self.N - self.M - self.N ) ) % M
        return ways ( self )
