def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        c = [ ]
        for i in range ( 1 , 3 ) :
            for j in range ( 1 , 3 ) :
                c.append ( sc.read ( ) )
        if c [ 2 ] [ 1 ] - c [ 1 ] [ 1 ] == c [ 2 ] [ 2 ] - c [ 1 ] [ 2 ] and c [ 2 ] [ 1 ] - c [ 1 ] [ 1 ] == c [ 2 ] [ 3 ] - c [ 1 ] [ 3 ] and c [ 3 ] [ 1 ] - c [ 1 ] [ 1 ] == c [ 3 ] [ 2 ] - c [ 1 ] [ 2 ] and c [ 3 ] [ 1 ] - c [ 1 ] [ 1 ] == c [ 3 ] [ 3 ] - c [ 1 ] [ 3 ] :
            self.out.append ( "Yes" )
        else :
            self.out.append ( "No" )
