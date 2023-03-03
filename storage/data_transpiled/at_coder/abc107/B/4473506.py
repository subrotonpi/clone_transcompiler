def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.h , self.w = sys.argv [ 1 ] , sys.argv [ 2 ]
        self.s = [ ]
        self.l = 0
        for x in self.s :
            if not x.isdigit ( ) :
                self.s.append ( x )
        self.b = [ ]
        outer :
            for i in range ( self.w ) :
                for j in range ( self.l ) :
                    if self.s [ j ] [ i ] == '#' :
                        continue
                self.b.append ( True )
            for i in range ( self.l ) :
                for j in range ( self.w ) :
                    if self.b [ j ] :
                        continue
                    print ( self.s [ i ] [ j ] , end = ' ' )
                print ( )
