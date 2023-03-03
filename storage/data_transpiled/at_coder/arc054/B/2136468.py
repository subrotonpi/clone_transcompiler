def _import ( ) : return
import math
import random
class Main ( object ) :
    def __init__ ( self ) :
        self.s = random.random ( )
        self.p = float ( self.p )
        f = lambda i : i + p / pow ( 2 , i / 1.5 )
        print ( f ( self.golden_selection_search ( 0 , p , 1e-9 , f ) ) )
    def golden_selection_search ( l , r , off , f ) :
        ( g , a , fa ) = ( 1 + math.sqrt ( 5 ) ) / 2 , ( 1 + g )
        b , fb = ( l + r * g ) / ( 1 + g ) , ( 1 + g )
        while l + off < r :
            if fa <= fb :
                r , b , fb = b , a , fa
                a , fa = ( l * g + r ) / ( 1 + g ) , ( 1 + g )
            else :
                l , a , fa , b , fb = a , b , ( l + r * g ) / ( 1 + g ) , ( 1 + g )
        return ( a + b ) / 2
