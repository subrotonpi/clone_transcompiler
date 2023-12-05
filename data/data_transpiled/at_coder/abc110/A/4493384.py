def import _sys
import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        x = [ ]
        for i in range ( 3 ) :
            x.append ( sc.read ( ) )
        x.sort ( reverse = True )
        print ( x [ 0 ] * 10 + x [ 1 ] + x [ 2 ] )
