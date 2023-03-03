def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.name = sys.argv [ 0 ]
    def __repr__ ( self ) :
        return "%s %s" % ( self.name , self.value )
    def __call__ ( self , path , line ) :
        line = path.split ( )
        n , m = map ( int , line [ : 2 ] )
        n60 = ( float ( n % 12 ) + ( float ( m ) / 60.0 ) ) * 5.0
        diff = abs ( n60 - float ( m ) )
        if diff > 30.0 :
            diff = 60.0 - diff
        print ( 6.0 * diff )
