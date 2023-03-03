def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin
    def __call__ ( self , n ) :
        a = int ( n )
        b = int ( n )
        c = int ( n ) * 2
        x = int ( n )
        y = int ( n )
        sum = 0
        if a + b > c :
            if x > y :
                sum += c * y
                if a < c :
                    sum += a * ( x - y )
                else :
                    sum += c * ( x - y )
            else :
                sum += c * x
                if b < c :
                    sum += b * ( y - x )
                else :
                    sum += c * ( y - x )
        else :
            sum += a * x + b * y
        print ( sum )
