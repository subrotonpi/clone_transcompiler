def import import _readline
import sys
class Main ( object ) :
    def __init__ ( self , s ) :
        self.s = s
    def __getitem__ ( self , x ) :
        return int ( self.s [ 0 ] )
    def __call__ ( self , __ ) :
        x , y = self.x , self.y
        print ( ( x - 1 ) * y + x * ( y - 1 ) )
