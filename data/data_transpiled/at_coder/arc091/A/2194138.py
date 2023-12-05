def import import sys
import os
import sys
import math
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        bf = sys.stdin
        bf = bf.readlines ( )
        n = int ( bf [ 0 ] )
        m = int ( bf [ 1 ] )
        ans = 0
        if ( n == 1 ) :
            ans = 1
        elif n == 1 :
            ans = ( m - 2 )
        elif m == 1 :
            ans = ( n - 2 )
        else :
            ans = 1 * ( m - 2 ) * ( n - 2 )
        print ( ans )
