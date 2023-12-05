def import import _sum , _p
from math import sin , cos , pi
class Main ( object ) :
    def __init__ ( self ) :
        self.sum = [ ]
        self.p = [ ]
        self.n = int ( self.n )
        x = float ( self.x )
        self.sum = [ 1 ] * n
        self.p = [ 1 ] * n
        self.sum [ 0 ] = 1
        self.p [ 0 ] = 1
        for i in range ( 1 , n ) :
            self.sum [ i ] = 2 * self.sum [ i - 1 ] + 3
            self.p [ i ] = 2 * self.p [ i - 1 ] + 1
        ans = self.f ( n , x )
        print ( ans )
    def f ( self , n , x ) :
        if n == 0 and x == 0 :
            return 0
        if n == 0 and x != 0 :
            return 1
        if x <= 1 :
            return 0
        elif x <= 1 + self.sum [ n - 1 ] :
            return self.f ( n - 1 , x - 1 )
        elif x <= 2 + 2 * self.sum [ n - 1 ] :
            return self.p [ n - 1 ] + 1 + self.f ( n - 1 , x - 2 - self.sum [ n - 1 ] )
        else :
            return 2 * self.p [ n - 1 ] + 1
