def import _main
import sys
import os
import sys
import math
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        st_n = sc.readline ( )
        n = int ( st_n )
        line = None
        lines = [ ]
        t = 0
        x = 0
        y = 0
        n_t = 0
        n_x = 0
        n_y = 0
        abs = 0
        for line in sc.readlines ( ) :
            lines = [ x.strip ( ) for x in line.split ( ) ]
            n_t = int ( lines [ 0 ] )
            n_x = int ( lines [ 1 ] )
            n_y = int ( lines [ 2 ] )
            abs = abs ( n_x - x ) + abs ( n_y - y )
            if abs == ( n_t - t ) :
                pass
            elif abs < ( n_t - t ) and ( ( n_t - t ) - abs ) % 2 == 0 :
                pass
            else :
                print ( "No" )
                return
            t = n_t
            x = n_x
            y = n_y
        print ( "Yes" )
