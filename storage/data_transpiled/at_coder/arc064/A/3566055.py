def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.x = int ( sys.stdin.read ( ) )
        self.a = [ ]
        s = 0
        for i in range ( n ) :
            self.a.append ( sys.stdin.read ( ) )
            s += self.a [ i ]
        self.a [ 0 ] = min ( self.a [ 0 ] , x )
        for i in range ( 1 , n ) :
            self.a [ i ] = min ( self.a [ i ] , x - self.a [ i - 1 ] )
            s -= self.a [ i ]
        print ( s - self.a [ 0 ] )
