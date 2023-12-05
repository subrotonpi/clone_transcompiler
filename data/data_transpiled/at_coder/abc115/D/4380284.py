def _ ( ) : return 1
import sys
import random
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.x = 0
        self.a = [ 1 ] * 51
        self.p = [ 1 ] * 51
        self.p = [ 1 ] * 51
        for i in range ( 50 ) :
            self.a [ i + 1 ] = 2 * self.a [ i ] + 3
            self.p [ i + 1 ] = 2 * self.p [ i ] + 1
        self.out.append ( self.f ( self.a , self.p , n , x ) )
    def f ( self , a , p , n , x ) :
        if n == 0 :
            return 1
        if x == 1 :
            return 0
        if x == 3 + 2 * self.a [ n - 1 ] :
            return self.p [ n - 1 ] * 2 + 1
        if x == self.a [ n - 1 ] + 2 :
            return self.p [ n - 1 ] + 1
        if 1 < x <= self.a [ n - 1 ] + 1 :
            return self.f ( self.a , self.p , self.n - 1 , x - 1 )
        return self.p [ n - 1 ] + 1 + self.f ( self.a , self.p , self.n - 1 , x - self.a [ n - 1 ] - 2 )
