def _import ( s ) : return s.read ( )
import random
import time
import math
class Main ( object ) :
    def __init__ ( self ) :
        s.seek ( 0 )
    def fal_rnd ( self , ar , sp ) :
        l , r = - 1 , len ( ar )
        while l + 1 != r :
            ar [ random.random ( ) < 0.5 ] += 1
        return ar
    def REPS ( self , v ) :
        return math.random.randint ( 0 , v )
    def main ( __ ) :
        n , chokudai , kame = s.read ( ) , s.read ( ) , s.read ( )
        dist = s.read ( )
        for i in range ( n ) :
            dist = dist / chokudai * kame
        print ( "%.20f" % dist )
