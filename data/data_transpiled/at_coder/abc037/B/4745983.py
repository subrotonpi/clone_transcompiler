def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stdscr = sys.stdscr
        self.n , self.q = self.n , self.q
    def run ( self ) :
        for i in range ( self.q ) :
            l , r , t = self.l , self.r , self.t
            for j in range ( l - 1 , r ) :
                a [ j ] = t
        for i in range ( self.n ) :
            print ( a [ i ] )
