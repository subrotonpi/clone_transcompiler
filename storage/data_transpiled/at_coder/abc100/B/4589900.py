def import _sys , stdin , data
import sys
class Main ( object ) :
    def __init__ ( self , args ) :
        self.input = args
        import sys
        l = data.readline ( )
        D , N = l.col [ 0 ] , l.col [ 1 ]
        sys.stdout.write ( int ( math.pow ( 100 , D ) * ( N == 100 ) ) )
    def readline ( self ) :
        return data.readline ( self ).split ( )
class Input ( object ) :
    def __init__ ( self , data ) :
        self.data = data
    def write ( self , value ) :
        self.data.write ( int ( value ) )
    def readline ( self ) :
        return data.readline ( self ).split ( )
class Data ( object ) :
    def __init__ ( self , values ) :
        self.col = [ int ( i ) for i in values ]
