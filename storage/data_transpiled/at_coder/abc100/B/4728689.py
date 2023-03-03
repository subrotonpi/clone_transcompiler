def import import sys
import math
import math
class Main ( object ) :
    def __init__ ( self ) :
        self.data = sys.stdin.read ( )
    def __call__ ( self ) :
        str = sys.stdin.read ( )
        input = [ int ( x ) for x in str.split ( ) ]
        print ( int ( ( input [ 1 ] + input [ 1 ] / 100 ) * math.pow ( 100 , input [ 0 ] ) ) )
