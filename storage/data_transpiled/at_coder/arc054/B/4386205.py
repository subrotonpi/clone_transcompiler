def _ ( ) : return x + p / ( pow ( 2 , x / 1.5 ) )
import sys
import math
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        sc = sys.stdin
        p = sc.read ( )
        if p >= 1.5 / log ( 2 ) :
            self.out.append ( f ( 1.5 * log ( log ( 2 ) * p / 1.5 ) / log ( 2 ) , p ) )
        else :
            self.out.append ( p )
    def f ( self , x , p ) :
        return x + p / ( pow ( 2 , x / 1.5 ) )
