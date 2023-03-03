def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = 1
        self.b = 2
        self.c = 3
    def __call__ ( self , a , b , c ) :
        co = 3
        if a == b :
            co -= 1
        if a == c :
            co -= 1
        if b == c :
            co -= 1
        if a == b and b == c :
            co = 1
        sys.stdout.write ( co )
