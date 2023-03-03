def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.m = int ( sys.stdin.read ( ) )
        self.a = [ ]
        self.b = [ ]
        self.c = [ ]
        self.d = [ ]
        for i in range ( self.n ) :
            self.a.append ( self.a [ i ] )
            self.b.append ( self.b [ i ] )
        for i in range ( self.m ) :
            self.c.append ( self.c [ i ] )
            self.d.append ( self.d [ i ] )
        dist = 0
        num = 1
        for i in range ( self.n ) :
            dist = abs ( self.c [ 0 ] - a [ i ] ) + abs ( self.d [ 0 ] - b [ i ] )
            for j in range ( self.m - 1 , - 1 , - 1 ) :
                if dist >= ( abs ( self.c [ j ] - a [ i ] ) + abs ( self.d [ j ] - b [ i ] ) ) :
                    num = j + 1
                    dist = abs ( self.c [ j ] - a [ i ] ) + abs ( self.d [ j ] - b [ i ] )
        print ( num )
