def import _main
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        sc = _main ( )
        s = sc.read ( )
        print ( s.decode ( 'utf-8' ) )
