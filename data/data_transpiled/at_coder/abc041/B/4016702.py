def import import _sys
class Main ( object ) :
    MOD = 1000000007L
    def __init__ ( self , a , b , c ) :
        Scanner ( ).__init__ ( self )
        a = _sys.stdin.read ( )
        b = _sys.stdin.read ( )
        c = _sys.stdin.read ( )
        total = a * b
        total %= MOD
        total *= c
        total %= MOD
        print ( total )
