def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.argv.index ( 'N' )
        if N > 17 :
            print ( 'Yes' )
        elif N < 4 :
            print ( 'No' )
        elif N in [ 5 , 6 , 9 , 10 , 13 , 17 ] :
            print ( 'No' )
        else :
            print ( 'Yes' )
