def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.d = int ( sys.stdin.read ( ) )
        self.x = int ( sys.stdin.read ( ) )
        self.a = [ ]
        for i in range ( self.n ) :
            self.a.append ( i )
        self.sum = 0
        for i in range ( self.n ) :
            if self.a [ i ] < self.d :
                for j in range ( 0 , self.a [ i ] + 1 <= self.d ) :
                    self.sum += 1
            else :
                self.sum += 1
        self.sum += self.x
        print ( self.sum )
        self.exit ( )
