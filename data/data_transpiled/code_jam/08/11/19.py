def import _collections
import collections
import itertools
import os
import sys
class Scalar ( object ) :
    def __init__ ( self , args ) :
        self.case_total = 0
        self.case_num = 1
        self.vector_size = 1
    def readline ( self ) :
        self.case_num = 0
        self.vector_size = len ( self.case_num )
        while self.case_num != 0 :
            print ( "Case #%d: " % self.case_num , end = ' ' )
            self.vector_size = self.case_num
            x = [ x [ 0 ] for x in self.x ]
            y = [ y [ 0 ] for y in self.y ]
            x.sort ( )
            y.sort ( )
            iy = self.vector_size - 1
            result = 0
            for ix in range ( self.vector_size ) :
                result += x [ ix ] * y [ iy ]
                iy -= 1
            print ( result )
            self.case_num += 1
            self.case_num -= 1
