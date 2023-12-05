def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.Q = sys.stdin.read ( )
        self.l = [ ]
        self.r = [ ]
        self.field = [ ]
        self.sum = [ 0 ]
        for i in range ( 1 , N + 1 ) :
            self.field.append ( 0 )
        for i in range ( self.Q ) :
            self.l.append ( self.l [ i ] )
            self.r.append ( self.r [ i ] )
        for i in range ( self.Q ) :
            self.field [ self.l [ i ] ] += 1
            self.field [ self.r [ i ] + 1 ] += - 1
        for i in range ( 1 , self.N + 1 ) :
            self.sum [ i ] = self.sum [ i - 1 ] + self.field [ i ]
        for i in range ( 1 , self.N + 1 ) :
            if self.sum [ i ] % 2 == 0 :
                print ( 0 , end = ' ' )
            else :
                print ( 1 , end = ' ' )
        print ( )
