def import import sys
import os
import sys
import random
import math
class Main ( sys.stdout ) :
    def __init__ ( self ) :
        Scanner ( )
        N = Scanner ( ).next ( )
        M = Scanner ( ).next ( )
        sum = 0
        cum = [ 0 ] * ( M + 2 )
        for i in range ( N ) :
            l , r , s = random.randint ( 0 , M )
            cum [ l ] += s
            cum [ r + 1 ] -= s
            sum += s
        for m in range ( 1 , M + 1 ) :
            cum [ m ] = cum [ m - 1 ] + cum [ m ]
        max = 0
        for m in range ( 1 , M + 1 ) :
            max = max ( max , sum - cum [ m ] )
        self.out.write ( max )
