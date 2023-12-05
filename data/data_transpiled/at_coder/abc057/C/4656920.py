def _import ( ) : return max ( len ( str ( A ) ) , len ( str ( B ) ) )
class Main ( object ) :
    def __init__ ( self , f ) :
        self.f = f
    def __call__ ( self , * args , ** kwargs ) :
        N = len ( args )
        min = sum ( [ F ( A , N // A ) for A in args ] )
        self.f = min
    def main ( self ) :
        exec ( open ( self.f , "r" ).read ( ) , globals ( ) )
