def import import os
class Main ( object ) :
    MOD = 1_000_000_007
    def __init__ ( self ) :
        self.MOD = MOD
    def __init__ ( self ) :
        self.FIB = [ 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 , 34 ]
    def main ( self ) :
        sc = open ( "/proc/" , "r" )
        self.H = sc.read ( )
        self.W = sc.read ( )
        self.K = sc.read ( )
        sc.close ( )
        dp = [ [ 1 ] * ( H + 1 ) + [ 1 ] * ( W + 1 ) ]
        if W == 1 :
            print ( 1 )
        else :
            for i in range ( 1 , self.H + 1 ) :
                for j in range ( 1 , self.W + 1 ) :
                    if j == 1 :
                        dp [ i ] [ j ] = ( dp [ i - 1 ] [ 2 ] * fib [ W - 2 ] + dp [ i - 1 ] [ 1 ] * fib [ W - 1 ] ) % MOD
                    elif j == self.W :
                        dp [ i ] [ j ] = ( dp [ i - 1 ] [ W - 1 ] * fib [ W - 2 ] + dp [ i - 1 ] [ W ] * fib [ W - 1 ] ) % MOD
                    else :
                        dp [ i ] [ j ] = ( dp [ i - 1 ] [ j - 1 ] * fib [ j - 2 ] * fib [ W - j ] + dp [ i - 1 ] [ j + 1 ] * fib [ j - 1 ] * fib [ W - ( j + 1 ) ] + dp [ i - 1 ] [ j ] * fib [ j - 1 ] * fib [ W - j ] ) % MOD
            print ( dp [ H ] [ K ] )
