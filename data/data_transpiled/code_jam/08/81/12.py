def _import ( ) : return sys._getframe ( ).f_code.co_name
import os
class A ( object ) :
    def __init__ ( self ) :
        self.f = open ( 'a.in' , 'w' )
        self.f.write ( '\n' )
    def get_coord ( x , y ) :
        return [ g ( x , y , x2 , y2 , x3 , y3 ) , g ( x1 , y1 , x , y , x3 , y3 ) , g ( x1 , y1 , x2 , y2 , x , y ) ]
    def g ( x1 , y1 , x2 , y2 , x3 , y3 ) :
        ar = x1 * y2 - x2 * y1 + x2 * y3 - x3 * y2 + x3 * y1 - x1 * y3
        return abs ( ar / area )
    def put ( self , c ) :
        return [ c [ 0 ] * x1 + c [ 1 ] * x2 + c [ 2 ] * x3 , c [ 0 ] * y1 + c [ 1 ] * y2 + c [ 2 ] * y3 ]
    def solve ( case ) :
        self.x1 , self.y1 , self.x2 , self.y2 , self.x3 , self.y3 = c
        area = x1 * y2 - x2 * y1 + x2 * y3 - x3 * y2 + x3 * y1 - x1 * y3
    def next ( self , a ) :
        a = Triangle ( self.f )
        b = Triangle ( self.f )
        cnt = 5000
        while b.area > 1e-20 or cnt > 0 :
            b = next ( a , b )
        print ( 'Case #%d: %d %d' % ( case , b.x1 , b.y1 ) )
