def import import struct
import sys
import struct
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
    def __next__ ( self , n ) :
        return intbv ( 0 ) [ n : ]
    def __next__ ( self ) :
        return intbv ( 0 ) [ n : ]
    def max ( * ar ) :
        ar.sort ( )
        return ar [ - 1 ]
    def min ( * ar ) :
        ar.sort ( )
        return ar [ 0 ]
    def max_ ( self ) :
        return max
    def min_ ( self ) :
        return min
    def main ( ) :
        s = struct.unpack ( ">i" , s )
        out ( s [ 0 ] == s [ 1 ] and s [ 2 ] == s [ 3 ] and s [ 2 ] == s [ 3 ] and s [ 3 ] == "SAME" or s [ 4 ] == "DIFFERENT" )
