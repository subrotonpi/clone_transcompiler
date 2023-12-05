def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
    def start ( self ) :
        self.t = 0
        self.ti = 0
        self.x = 0
        self.xi = 0
        self.y = 0
        self.yi = 0
        self.d = 0
        for i in range ( self.n ) :
            ti , xi , yi = [ int ( i ) for i in self.ti ]
            d = int ( abs ( xi - x ) + abs ( yi - y ) )
            if self.ti - t < d or abs ( d - self.ti + t ) % 2 == 1 :
                print ( "No" )
                self.n = int ( sys.stdin.readline ( ) )
                return
            self.t = ti
            self.x = xi
            self.y = yi
        print ( "Yes" )
        self.n = int ( sys.stdin.readline ( ) )
