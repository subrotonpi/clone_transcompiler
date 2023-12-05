def import _sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = _sys.stdin
        self.data = sc.read ( )
    def main ( self ) :
        str = self.data
        ans = sys.maxint
        for i in range ( len ( str ) - 2 ) :
            value = int ( str [ i : i + 3 ] )
            ans = min ( abs ( 753 - value ) , ans )
        print ( ans )
