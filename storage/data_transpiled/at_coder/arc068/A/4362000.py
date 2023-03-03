def import import struct
import sys
import struct
import time
class Main ( object ) :
    def __init__ ( self ) :
        self.raw_input = sys.stdin
    def __next__ ( self ) :
        return int ( self.raw_input )
    def __next__ ( self ) :
        return long ( self.raw_input )
    def __next__ ( self , n ) :
        return intbv ( 0 ) [ n : ]
    def max ( * ar ) :
        ar.sort ( )
        return ar [ - 1 ]
    def min ( * ar ) :
        ar.sort ( )
        return ar [ 0 ]
    def yesno ( self , b ) :
        return "Yes" if b else "No"
    def maxint ( self ) :
        return int ( self.maxsize )
    def minint ( self ) :
        return int ( self.minint )
    def main ( ) :
        n = next ( )
        if n % 11 == 0 :
            print ( n / 11 * 2 )
        elif n % 11 <= 6 :
            print ( n / 11 * 2 + 1 )
        else :
            print ( n / 11 * 2 + 2 )
