def import import sys
import os
import sys
import getopt
class Main ( object ) :
    def __init__ ( self ) :
        self.input = sys.stdin
        n = int ( self.input [ 0 ] )
        n_values = [ 2 , 1 ]
        for i in range ( 2 , n + 1 ) :
            n_values [ i ] = n_values [ i - 1 ] + n_values [ i - 2 ]
        print ( n_values [ n ] )
