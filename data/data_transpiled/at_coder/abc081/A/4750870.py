def import import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        s = sc.read ( )
        s = s.replace ( '0' , '' )
        print ( len ( s ) )
