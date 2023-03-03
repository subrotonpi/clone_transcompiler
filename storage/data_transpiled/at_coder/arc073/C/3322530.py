def _import ( ) : return ''
import sys
import os
import os
import sys
import os
import sys
import struct
import struct
class Main ( object ) :
    def __init__ ( self , f ) :
        self.N = 0
        self.B = [ ]
        self.xmin = self.x
        self.y = self.y
    def flip ( self ) :
        t = self.x
        self.y = self.y
    def readline ( self ) :
        if not self.x or not self.y :
            try :
                return self.x
            except :
                raise ValueError ( )
        return self.y
    def case_min_is_other_size ( self , min , max ) :
        rmin = min
        bmin = max
        for b in B :
            b.reset ( )
            rmax = max
            bmin = min
        return long ( rmax - bmin ) , ans
    def solve ( self ) :
        if self.N == 1 :
            return long ( self.y - B [ 0 ] [ 0 ] ) * ( B [ 0 ] [ 1 ] - B [ 0 ] [ 0 ] )
        min = int ( min )
        max = - 1
        for b in B :
            if min > b [ 0 ] [ 0 ] :
                min = b [ 0 ] [ 0 ]
            if max < b [ 1 ] :
                max = b [ 1 ]
        return min , max , case_min_is_other_size ( min , max )
    def case_min_is_same_side ( min , max ) :
        B = [ ]
        for b in B :
            b.reset ( )
            a = [ ]
        return long ( min ) , int ( max ) , ans
