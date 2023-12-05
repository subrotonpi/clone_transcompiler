def import sys
class Main ( object ) :
    def __init__ ( self , a , b ) :
        self.a = a
        self.b = b
        self.d = b - a
    push = [ 0 , 1 , 2 , 3 , 2 , 1 , 2 , 3 , 3 , 2 ]
    pl ( abs ( d / 10 ) + push [ abs ( d % 10 ) ] )
    def pr ( self ) :
        print ( self.a , end = ' ' )
    def pl ( self ) :
        print ( self.b , end = ' ' )
