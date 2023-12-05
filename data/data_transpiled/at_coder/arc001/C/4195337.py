def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
    def __call__ ( self , a , b ) :
        x = abs ( a - b )
        count = 0
        while x >= 8 :
            x = abs ( x - 10 )
            count += 1
        while x >= 4 :
            x = abs ( x - 5 )
            count += 1
        count += x
        print ( count )
