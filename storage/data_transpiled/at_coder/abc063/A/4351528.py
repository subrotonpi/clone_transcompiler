def import import sys
class Main ( object ) :
    po = ( 0 , 2 , 0 , 1 , 0 , 1 , 0 , 0 , 1 , 0 , 1 , 0 )
    def __init__ ( self ) :
        self.po = po
    def go ( self ) :
        n , m = self.po
        print ( ( n + m if m < 10 else "error" ) )
