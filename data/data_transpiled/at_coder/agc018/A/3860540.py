def import import sys , string , randrange
from os import urandom
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.K = int ( sys.stdin.read ( ) )
        self.a = [ random.randrange ( n ) for i in range ( self.n ) ]
        print ( self.help ( self.a , K ) )
    def help ( self , a , K ) :
        n = len ( a )
        max = a [ 0 ]
        if a [ 0 ] == K : return "POSSIBLE"
        div = a [ 0 ]
        for i in range ( 1 , n ) :
            if a [ i ] == K : return "POSSIBLE"
            max = max ( max , a [ i ] )
            div = self.gcd ( div , a [ i ] )
        if max < K : return "IMPOSSIBLE"
        return ( max - K ) % div == 0
    def gcd ( self , a , b ) :
        if a < b :
            med , b = b , a
            a = med
        while a % b :
            s , a , b = b , s % a
        return b
