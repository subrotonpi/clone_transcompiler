def import import sys
import os
import math
import math
import math
import math
import math
import os
import re
class ab :
    def __init__ ( self ) :
        self.f = open ( "A.in" )
        self.w = open ( "A.txt" , "w" )
        self.t = int ( self.f.readline ( ) )
        for d in range ( 1 , t + 1 ) :
            g = os.popen ( " ".join ( self.f.readline ( ) ) ).readlines ( )
            l = int ( g [ 0 ] )
            p = int ( g [ 1 ] )
            c = int ( g [ 2 ] )
            ans = int ( ( math.ceil ( math.log ( math.ceil ( math.log ( p / float ( l ) ) / math.log ( c ) ) ) ) / math.log ( 2 ) ) )
            self.w.write ( "Case #%d: %d\n" % ( d , ans ) )
