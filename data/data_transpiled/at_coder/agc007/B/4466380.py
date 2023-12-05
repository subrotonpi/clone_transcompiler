def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = len ( sys.argv )
    def main ( self ) :
        self.a = [ ]
        self.b = [ ]
        self.p = [ ]
        self.a.append ( 1 )
        self.b.append ( 1 )
        for i in range ( self.n ) :
            p1 = self.a [ i ] - 1
            self.p.append ( p1 )
            if i > 0 :
                self.a [ i ] = self.a [ i - 1 ] + 20000
                self.b [ n - 1 - i ] = self.b [ n - i ] + 20000
        for i in range ( self.n ) :
            self.a [ self.p [ i ] ] += i
        for i in range ( self.n ) :
            print ( self.a [ i ] , end = ' ' )
        print ( )
        for i in range ( self.n ) :
            print ( self.b [ i ] , end = ' ' )
