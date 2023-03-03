def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
    def main ( self ) :
        return sys.stdin.read ( )
    def main ( self ) :
        return Main ( self )
    def main ( self ) :
        return Main ( self )
    n = int ( sys.stdin.read ( ) )
    a = [ [ ] for _ in range ( n ) ]
    ans = 0
    for i in range ( n - 1 , - 1 , - 1 ) :
        if ( a [ i ] [ 0 ] + ans ) % a [ i ] [ 1 ] != 0 :
            ans += a [ i ] [ 1 ] - ( ( a [ i ] [ 0 ] + ans ) % a [ i ] [ 1 ] )
    print ( ans )
    sys.exit ( 0 )
