def import _int64_function
import int64_function
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        self.n , self.a = args
        self.a = int64_function ( self.a )
        print ( int64_function ( self.a ) )
