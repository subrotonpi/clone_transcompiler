def import import _main
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = _main ( args )
        s = sc.read ( )
        s = s.rstrip ( ',' )
        print ( s )
