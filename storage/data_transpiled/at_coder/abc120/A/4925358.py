def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        s = sys.stdin
        A , B , C = s.read ( ).split ( '\n' )
        print ( min ( B / A , C ) )
