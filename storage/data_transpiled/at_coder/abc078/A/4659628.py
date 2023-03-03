def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = sys.stdin
    def __call__ ( self , x , y ) :
        x = x.encode ( 'utf-8' )
        y = y.encode ( 'utf-8' )
        x_byte = x.encode ( 'utf-8' )
        y_byte = y.encode ( 'utf-8' )
        if x_byte [ 0 ] > y_byte [ 0 ] :
            print ( '>' )
        elif x_byte [ 0 ] < y_byte [ 0 ] :
            print ( '<' )
        else :
            print ( '=' )
