def import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = ''
    def min ( self ) :
        return 1000
    sc = _sys.stdin.read ( )
    s = sc.decode ( 'utf-8' )
    for i in range ( len ( s ) - 2 ) :
        min = min ( min , abs ( 753 - int ( s [ i : i + 3 ] ) ) )
    print ( min )
