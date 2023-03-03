def import import sys
class Main ( object ) :
    def __init__ ( self , a , b , x ) :
        self.a = a
        self.b = b
        self.x = x
        print ( self.f ( b , x ) - self.f ( a - 1 , x ) )
    def f ( self , s , x ) :
        if s == - 1 :
            return 0
        return s / x + 1
