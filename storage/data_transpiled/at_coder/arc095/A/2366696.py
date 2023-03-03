def import _solve_a
import sys
import os
import sys
import random
import sys
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self.solve_a = _solve_a
    def solve_a ( self ) :
        with open ( "/proc/stations/" , "r" ) as sc :
            data = [ ]
            N = len ( sc.read ( ) )
            for i in range ( N ) :
                data.append ( sc.read ( ) )
            sorted_list = sorted ( data )
            median = sorted_list [ N // 2 ]
            median_minus = sorted_list [ N // 2 - 1 ]
            for i in data :
                if i >= median :
                    print ( median_minus )
                else :
                    print ( median )
