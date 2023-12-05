def import sys
class Main ( object ) :
    def __init__ ( self , S ) :
        self.S = S
        if ( len ( S ) - ( S [ 0 ] == S [ - 1 ] ) ) % 2 == 0 :
            print ( "Second" )
        else :
            print ( "First" )
