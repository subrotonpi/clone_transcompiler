def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.k = int ( sys.stdin.read ( ) )
    def __init__ ( self , n , k ) :
        self.n = int ( n )
        self.k = int ( sys.stdin.read ( ) )
        self.a = [ [ ] for _ in range ( 2 ) ]
        self.a.sort ( key = lambda x : cmp ( x [ 0 ] , y [ 0 ] ) )
        for i in range ( n ) :
            self.k -= int ( self.a [ i ] [ 1 ] )
            if k <= 0 :
                print ( self.a [ i ] )
                break
