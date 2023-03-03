def import _operation
import sys
import os
import sys
import getopt
import getopt
class Main ( object ) :
    def __init__ ( self ) :
        open ( self , 'r' )
        tokens = sys.stdin.readline ( ).split ( )
        values = [ int ( token ) for token in tokens ]
        values.sort ( )
        result = 0
        while 1 :
            r = operation ( values )
            if r == 0 :
                break
            result += r
            values.sort ( )
        print ( result )
        f.close ( )
    def operation ( values ) :
        if values [ 0 ] == values [ 2 ] :
            return 0
        if values [ 0 ] == values [ 1 ] :
            result = values [ 2 ] - values [ 1 ]
            values [ 0 ] = values [ 2 ]
            values [ 1 ] = values [ 2 ]
            return result
        if ( values [ 1 ] - values [ 0 ] ) % 2 == 0 :
            result = ( values [ 1 ] - values [ 0 ] ) / 2
            values [ 0 ] = values [ 1 ]
            return result
        else :
            result = ( values [ 1 ] + 1 - values [ 0 ] ) / 2
            values [ 0 ] = values [ 1 ]
            values [ 1 ] = values [ 1 ] + 1
            return result
