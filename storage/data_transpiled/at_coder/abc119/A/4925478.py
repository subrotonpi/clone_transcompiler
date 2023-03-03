def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        x = self.s.readline ( )
        y = int ( x [ 5 : 7 ] )
        if y > 4 :
            print ( "TBD" )
        else :
            print ( "Heisei" )
