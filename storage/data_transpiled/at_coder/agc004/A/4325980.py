def import math
class Main ( object ) :
    def __init__ ( self , a , b , c ) :
        self.a = a
        self.b = b
        self.c = c
        if a % 2 == 0 or b % 2 == 0 or c % 2 == 0 :
            self.print ( 0 )
        else :
            self.print ( min ( a * b , min ( b * c , c * a ) ) )
