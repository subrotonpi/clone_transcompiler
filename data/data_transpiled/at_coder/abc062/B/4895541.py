def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.h , self.w = sys.argv [ 1 ] , sys.argv [ 2 ]
    def __init__ ( self ) :
        self.h , self.w = self.h , self.w
    def __repr__ ( self ) :
        return "#" + "#".join ( [ "%-20s" % ( i , j ) for j in range ( self.h + 2 ) ] ) + "#"
    def __call__ ( self ) :
        return "#" + "#".join ( [ "%-20s" % ( i , j ) for j in range ( self.w + 2 ) ] ) + "#"
