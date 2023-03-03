def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.c = [ ]
        self.s = [ ]
        self.f = [ ]
        for i in range ( 1 , n ) :
            self.c.append ( self.c [ i ] )
            self.s.append ( self.s [ i ] )
            self.f.append ( self.f [ i ] )
    a = [ ]
    for i in range ( 1 , n ) :
        b = [ ]
        for j in range ( i + 1 , n + 1 ) :
            if b [ j - 1 ] <= self.s [ j - 1 ] :
                b.append ( self.s [ j - 1 ] + self.c [ j - 1 ] )
            elif b [ j - 1 ] % self.f [ j - 1 ] == 0 :
                b.append ( b [ j - 1 ] + self.c [ j - 1 ] )
            else :
                b.append ( b [ j - 1 ] + ( self.f [ j - 1 ] - ( b [ j - 1 ] % self.f [ j - 1 ] ) ) + self.c [ j - 1 ] )
        a.append ( b )
    for i in range ( 1 , n + 1 ) :
        print ( a [ i ] )
