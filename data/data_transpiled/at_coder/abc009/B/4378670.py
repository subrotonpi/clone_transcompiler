def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
    def go ( self ) :
        self.n = int ( self.n )
    po = [ go ( ) for i in range ( n ) ]
    for i in range ( len ( po ) - 1 ) :
        for j in range ( i , len ( po ) - 1 ) :
            if po [ i ] == po [ j + 1 ] :
                del po [ j + 1 ]
                j -= 1
    po.sort ( )
    print ( po [ - 2 ] )
