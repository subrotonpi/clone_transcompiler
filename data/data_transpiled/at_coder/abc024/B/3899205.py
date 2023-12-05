def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
        self.t = sys.maxint
        self.a = [ ]
        time = 0
        for i in range ( n ) :
            self.a.append ( sys.stdin.read ( ) )
            time += t
        for i in range ( 1 , n ) :
            if self.a [ i - 1 ] + t >= self.a [ i ] :
                time += self.a [ i ] - self.a [ i - 1 ] - t
        print ( time )
