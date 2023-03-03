def import import math
import random
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = random.randint ( 1 , 10000 )
        self.k = random.randint ( 1 , 10000 )
        s = [ random.randint ( 1 , 10000 ) for i in range ( n ) ]
        seki = 1
        max = 0
        s = [ ]
        start = 0
        for i in range ( n ) :
            seki *= s [ i ]
            if seki == 0 :
                max = n
                break
            s.append ( i )
            if seki > k :
                max = max ( max , s [ - 1 ] )
                while seki > k and s [ - 1 ] > 0 :
                    seki /= s [ - 1 ]
                    start += 1
                    s.append ( i )
        max = max ( max , s [ - 1 ] )
        print ( max )
