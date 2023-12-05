def import import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.m = int ( self.m )
    def __call__ ( self , * args ) :
        return _sys.argv [ 0 ]
    def main ( self ) :
        return _sys.argv [ 1 ]
    n = int ( sys.stdin.read ( ) )
    m = int ( sys.stdin.read ( ) )
    ans = 0
    po = [ 0 ]
    for i in range ( 1 , n + 1 ) :
        po [ i ] = po [ i - 1 ] + _sys.stdin.read ( )
    for i in range ( m , n + 1 ) :
        ans += ( po [ i ] - po [ i - m ] )
    print ( ans )
