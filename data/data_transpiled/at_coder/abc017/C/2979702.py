def _import ( ) : return [ int ( x ) for x in range ( 0 , len ( x ) ) ]
def _readline ( ) : return [ x for x in range ( 0 , len ( x ) ) ]
def _readline ( ) : return [ x for x in range ( 0 , len ( x ) ) ]
def _eval ( ) : return [ x for x in range ( 0 , len ( x ) ) ]
def main ( ) :
    sc = _readline ( )
    N = sc.__next__ ( )
    M = sc.__next__ ( )
    D = [ ( sc.__next__ ( ) - 1 , sc.__next__ ( ) - 1 , sc.__next__ ( ) ) for i in range ( N ) ]
    print ( solve ( ) )
def solve ( ) :
    imos = [ 0 ] * ( M + 1 )
    total = 0
    for d in D :
        imos [ d.l ] += d.s
        imos [ d.r + 1 ] -= d.s
        total += d.s
    min = imos [ 0 ]
    for i in range ( 1 , M ) :
        imos [ i ] += imos [ i - 1 ]
        min = min ( imos [ i ] , min )
    return total - min
class Dangeon ( ) :
    def __init__ ( self , l , r , s ) :
        self.l = l
        self.r = r
        self.s = s
    @ staticmethod
    def readline ( ) :
        return [ int ( x ) for x in readline ( ) ]
    def __next__ ( self ) :
        return [ int ( x ) for x in readline ( ) ]
    def readline ( ) :
        return [ int ( x ) for x in readline ( ) ]
    def __next__ ( self ) :
        return [ int ( x ) for x in readline ( ) ]
