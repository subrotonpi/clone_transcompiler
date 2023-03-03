def import import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = _sys.stdin.read ( )
        self.s = _sys.stdin.read ( )
        self.s = _sys.stdin.read ( )
        self.num = [ 0 ] * 26
        for c in s :
            num [ c - 'a' ] += 1
        ans = 1 + int ( len ( s ) ) * int ( ( len ( s ) - 1 ) ) / 2
        for i in range ( 26 ) :
            ans -= num [ i ] * ( num [ i ] - 1 ) / 2
        print ( ans )
