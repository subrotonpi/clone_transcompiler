def import _Scanner
class Main ( object ) :
    def __init__ ( self , s ) :
        self.s = s
    def g_int ( self ) :
        return int ( self.s )
    def main ( self , * args , ** kwargs ) :
        a , b , k , l = g_int ( * args , ** kwargs )
        print ( min ( k / l * b + ( k - k / l * l ) * a , ( k / l + 1 ) * b ) )
