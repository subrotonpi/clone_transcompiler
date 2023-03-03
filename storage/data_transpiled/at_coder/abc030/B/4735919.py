def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.main = Main ( )
        self.solve ( )
    def solve ( self ) :
        sc = sys.stdin.readline ( )
        n , m = map ( float , sc.split ( ) )
        sc.close ( )
        if n >= 12 :
            n -= 12
        n *= 5 * 6
        m *= ( 11.0 / 2 )
        rad = abs ( n - m )
        rad = min ( rad , 360 - rad )
        print ( rad )
