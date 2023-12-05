def import import sys , string , count , maxint , minint
from random import randint
from itertools import chain
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
    def __next__ ( self , n ) :
        return int ( next ( self.sc ) )
    def __next__ ( self ) :
        return intbv ( 0 ) [ n : ]
    def max ( self , * ar ) :
        ar.sort ( )
        return ar [ - 1 ]
    def min ( self , * ar ) :
        ar.sort ( )
        return ar [ 0 ]
    def maxint ( self ) :
        ar = next_int ( 5 )
        lst = [ ]
        for i in ( pow ( 2 , 5 ) ) :
            if sum ( i ) != 3 :
                continue
            temp_sum = 0
            for j in range ( 5 ) :
                if ( 1 & i >> j ) == 1 :
                    temp_sum += ar [ j ]
            lst.append ( temp_sum )
        lst.sort ( )
        out ( lst [ - 3 ] )
