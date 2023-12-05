def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.sum = 0
        for i in range ( a , b + 1 ) :
            c = 1
            s = str ( i )
            for j in range ( 5 / 2 ) :
                if s [ j ] != s [ 5 - j - 1 ] :
                    c = 0
            if c != 0 :
                self.sum += 1
        print ( self.sum )
        self.a = a
        self.b = b
