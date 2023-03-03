def import _main
class Main ( object ) :
    def __init__ ( self ) :
        s = _main ( )
        a , b = abs ( s.__next__ ( ) ) , abs ( s.__next__ ( ) )
        print ( 'Draw' if a == b else 'Ant' if a < b else 'Bug' )
