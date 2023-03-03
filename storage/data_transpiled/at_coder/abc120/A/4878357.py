def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        A , B , C = [ int ( x ) for x in sys.stdin ]
        print ( min ( C , B / A ) )
