def import _import_2_3
import os
import sys
import os
import sys
import math
import os
import sys
class A_Round1A ( object ) :
    def sum_even ( v ) :
        v = v / 2
        return v * v + 1
    def sum_odd ( v ) :
        v = v + 1 / 2
        return v * v
    def main ( ) :
        with open ( 'A-large.in' , 'r' ) as f :
            with open ( 'A-large3.out' , 'w' ) as f :
                n = len ( f.readlines ( ) )
    n = sys.argv [ 1 ]
    for tt in range ( n ) :
        print ( 'Case #%d: ' % ( tt + 1 ) , end = ' ' )
        r , t = A_Round1A ( )
        r , t = A_Round1A ( )
        low , hi = 0 , 80710678000000l
        while low < hi :
            mid = low + ( ( hi - low + 1 ) / 2 )
            sum = 0
            if r and 1 < r :
                sum = sum_even ( r + mid * 2 ) - sum_even ( r - mid )
            else :
                sum = sum_odd ( r + mid * 2 ) - sum_odd ( r - mid )
            sum = ( sum * 2 ) + mid + 1
            if sum > t :
                hi = mid - 1
            else :
                low = mid
        print ( low , end = ' ' )
