def import import struct
import struct
import sys
class Main ( struct.Struct ) :
    def __init__ ( self ) :
        struct.Struct.__init__ ( self )
        self.s = struct.Struct ( 'i' )
    def __next__ ( self , n ) :
        return intbv ( 0 ) [ n : ]
    def max ( * ar ) :
        ar.sort ( )
        return ar [ - 1 ]
    def min ( * ar ) :
        ar.sort ( )
        return ar [ 0 ]
    def maxInt ( self ) :
        return struct.Struct.maxInt
    def minInt ( self ) :
        return struct.Struct.minInt
