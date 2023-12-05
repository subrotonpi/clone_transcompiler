def import import sys
class Main ( object ) :
    def __init__ ( self , a , b , c ) :
        self.a = a
        self.b = b
        self.c = c
        self.s = b / a
        if self.s > self.c :
            print ( self.c )
        else :
            print ( self.s )
