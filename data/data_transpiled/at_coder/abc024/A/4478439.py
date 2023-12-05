def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a , self.b , self.c , self.k , self.s , self.t , g = 0 , 0 , 0 , 0
        self.a , self.b , self.c , self.k , self.s , self.t = self.s , self.t , self.g
        self.g = self.a * self.s + self.b * self.t
        if self.s + self.t >= self.k :
            g -= ( self.s + self.t ) * self.c
        print ( g )
