def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.argv [ 1 ] )
        self.a = int ( sys.argv [ 2 ] )
        self.b = int ( sys.argv [ 3 ] )
        self.c = int ( sys.argv [ 4 ] )
        self.d = int ( sys.argv [ 5 ] )
    def run ( self ) :
        for i in range ( self.n - 1 ) :
            if self.c * ( self.n - 1 - i ) - self.d * i <= b - a <= - self.c * i + ( self.n - 1 - i ) * self.d :
                print ( "YES" )
                return
        print ( "NO" )
