def import import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        s = sc.next ( )
        s = s.rstrip ( '0' )
        print ( len ( s ) )
