def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.m = sys.stdin.read ( )
        self.l = [ ]
        self.r = [ ]
        self.s = [ ]
        self.all = 0
        for i in range ( self.n ) :
            self.l.append ( self.l [ i ] - 1 )
            self.r.append ( self.r [ i ] - 1 )
            self.s.append ( self.s [ i ] )
            self.all += self.s [ i ]
        self.all = 0
    def __init__ ( self ) :
        self.n = 0
        self.m = 0
        self.l = [ ]
        self.r = [ ]
        self.s = [ ]
        self.all += self.s [ i ]
    def __repr__ ( self ) :
        minus = [ ]
        for i in range ( self.n ) :
            minus.append ( self.l [ i ] )
            minus.append ( self.r [ i ] + 1 )
        for i in range ( 1 , self.m ) :
            minus.append ( minus [ i - 1 ] + minus [ i ] )
        min = sum ( minus )
        for i in range ( self.m ) :
            min = min ( min , minus [ i ] )
        print ( all - min )
