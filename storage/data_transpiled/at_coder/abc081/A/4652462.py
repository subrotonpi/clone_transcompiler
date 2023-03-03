def import import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        str = sc.read ( ).replace ( '0' , '' )
        print ( len ( str ) )
