def import _main
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        s = _main ( * args , ** kwargs )
        print ( 'Yes' if s.get ( 'Yes' ) == s.get ( 'No' ).upper ( ) else 'No' )
