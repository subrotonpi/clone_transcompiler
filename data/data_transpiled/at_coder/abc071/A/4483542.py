def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.x , self.a , self.b = sys.stdin.read ( ).split ( '\n' )
        self.simple_dist ( self.x , self.a , self.b )
    def simple_dist ( self , x , a , b ) :
        max , min = 1000 , 1
        if ( x <= max and a <= max and b <= max ) and ( x >= min and a >= min and b >= min ) :
            res = 'A' if abs ( x - a ) < abs ( x - b ) else 'B'
            print ( res )
