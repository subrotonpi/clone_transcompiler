def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N , self.Q = sys.stdin.readline ( ).split ( )
        self.str = sys.stdin.readline ( ).split ( )
        self.l , self.r = [ ] , [ ]
        for i in range ( self.Q ) :
            self.l.append ( self.l [ i ] )
            self.r.append ( self.r [ i ] )
        self.sum = [ ]
        a = 'A'
        c = 'C'
        for i in range ( 1 , N ) :
            if self.str [ i - 1 ] == a and self.str [ i ] == c :
                self.sum.append ( self.sum [ i ] + 1 )
            else :
                self.sum.append ( self.sum [ i ] )
        for i in range ( self.Q ) :
            ans = self.sum [ r [ i ] ] - self.sum [ l [ i ] ]
            print ( ans )
