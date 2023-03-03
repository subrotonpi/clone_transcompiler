def import _main
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        self.c = _main ( args , kwargs )
        x = self.c.get ( 'x' )
        print ( self.c.get ( 'x' ).decode ( 'utf-8' ) )
