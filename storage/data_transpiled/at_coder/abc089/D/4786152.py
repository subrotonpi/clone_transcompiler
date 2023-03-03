def import sc
import sys
import string
import string
import sys
import struct
import math
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        O = sys.stdout
        h , w , d = struct.unpack ( '>IIII' , args [ 0 ] )
        a = [ ]
        point = [ ]
        for i in range ( h ) :
            for j in range ( w ) :
                a.append ( struct.unpack ( '>IIII' , args [ 1 ] ) )
                point [ a [ i ] [ j ] ] = i * w + j
        ds = [ 0 ] * h * w + 1
        for i in range ( 1 , h * w + 1 ) :
            if i > d :
                ds.append ( ds [ i - d ] + abs ( point [ i ] / w - point [ i - d ] / w ) + abs ( point [ i ] % w - point [ i - d ] % w ) )
        q = struct.unpack ( '>IIII' , args [ 1 ] )
        for i in range ( q ) :
            l = struct.unpack ( '>IIII' , args [ 1 ] )
            r = struct.unpack ( '>IIII' , args [ 2 ] )
            O.write ( ds [ r ] - ds [ l ] )
        O.flush ( )
    def read ( self ) :
        return self.s
    def write ( self , s ) :
        return s
    def write ( self , s ) :
        return self.s
