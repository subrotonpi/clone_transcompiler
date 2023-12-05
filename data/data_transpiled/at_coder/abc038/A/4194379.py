def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.name = sys.argv [ 0 ]
    def __call__ ( self , name ) :
        self.name = name
        last_letter = name [ - 1 ]
        if last_letter == 'T' :
            print ( 'YES' )
        else :
            print ( 'NO' )
