def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.q = sys.stdin.read ( )
        self.a = [ ]
        for i in range ( self.q ) :
            l , r , t = self.a [ i - 1 ]
            for _ in range ( r ) :
                self.a.append ( t )
        for i in self.a :
            print ( i )
