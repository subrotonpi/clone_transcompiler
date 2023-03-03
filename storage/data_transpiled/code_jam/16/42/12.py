def import import sys , random
from os import urandom
from random import randint , random
class C ( object ) :
    def __init__ ( self ) :
        self.f = sys.stdin
        self.stdout = sys.stdout
        self.f = open ( self.f.fileno ( ) , 'w' )
        self.f.write ( '\n'.join ( [ '%.4f' % i for i in range ( n ) ] ) )
    def solve ( self , arg ) :
        n , k = int ( random ( ) ) , int ( random ( ) )
        p = [ random ( ) for i in range ( n ) ]
        p.sort ( )
        ans = 0
        for l in range ( 0 , k ) :
            r = k - l
            ps = [ ]
            ptr = random ( )
            for i in range ( l ) :
                ps.append ( p [ i ] )
            for i in range ( n - r , n ) :
                ps.append ( p [ i ] )
        balance_zero = k
        max_balance = 2 * k
        dp = [ [ 1 ] * ( max_balance + 1 ) for i in range ( k ) ]
        dp [ 0 ] [ balance_zero ] = 1
        for i in range ( k ) :
            for j in range ( 0 , max_balance ) :
                if dp [ i ] [ j ] != 0 :
                    dp [ i + 1 ] [ j + 1 ] += dp [ i ] [ j ] * ps [ i ]
                    dp [ i + 1 ] [ j - 1 ] += dp [ i ] [ j ] * ( 1 - ps [ i ] )
        if dp [ k ] [ balance_zero ] > ans :
            ans = dp [ k ] [ balance_zero ]
    print ( ans )
