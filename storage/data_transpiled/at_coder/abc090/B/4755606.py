def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = 0
        for i in range ( self.a , self.b + 1 ) :
            d = i % 10
            e = i // 10000 % 10
            f = i // 10 % 10
            g = i // 1000 % 10
            if d == e and f == g :
                self.c += 1
        print ( self.c )
