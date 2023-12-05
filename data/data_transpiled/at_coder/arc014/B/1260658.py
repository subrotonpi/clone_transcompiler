def _import ( ) : return _import ( set ( ) )
import os
import random
import math
import random
import time
class Main ( object ) :
    def __init__ ( self , s ) :
        self.s = s
    def fal_rnd ( self , ar , sp ) :
        l , r = - 1 , len ( ar )
        while l + 1 != r :
            ar [ random.random ( ) < 0.5 ] += 1
            l , r = l , r
        return ar
    def REPS ( self , v ) :
        return random.randint ( 0 , v )
    def main ( __ ) :
        r , n = - 1 , s.__next__ ( )
        inp = s.next ( )
        seen = set ( range ( 100 ) )
        for i in range ( 1 , n ) :
            ninp = s.next ( )
            if ninp [ 0 ] != inp [ - 1 ] or ninp in seen :
                r = i
                break
            inp = ninp
            seen.add ( inp )
        print ( 'DRAW' if r == - 1 else 'WIN' if r % 2 == 1 else 'LOSE' )
