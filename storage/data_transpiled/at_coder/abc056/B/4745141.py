def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.w , a , b = sys.argv [ 1 ] , sys.argv [ 2 ] , sys.argv [ 3 ]
        print ( ( abs ( a - b ) <= w ) )
