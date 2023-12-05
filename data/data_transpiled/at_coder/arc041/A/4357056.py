def import _main
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        self.c = _main ( args , kwargs )
        x , y , k = self.c.split ( )
        print ( x + k if y >= k else x + 2 * y - k )
