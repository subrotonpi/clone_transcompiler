def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.M = sys.stdin.read ( )
        self.X = sys.stdin.read ( )
        self.math = [ 0 ] * ( self.N + 1 )
        for i in range ( self.M ) :
            x = sys.stdin.read ( )
            self.math [ x ] += 1
        route1 = self.route2 = 0
        for i in range ( ( self.X + 1 ) , self.N + 1 ) :
            route1 += self.math [ i ]
        for i in range ( ( self.X - 1 ) , - 1 , - 1 ) :
            route2 += self.math [ i ]
        if route1 <= route2 :
            print ( route1 )
        else :
            print ( route2 )
