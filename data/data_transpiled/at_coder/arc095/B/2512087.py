def import solve
import sys
import os
from math import sin , cos , exp
solve ( )
def solve ( ) :
    with open ( 'test.txt' , 'r' ) as sc :
        n = sc.read ( )
        a = [ sin ( i ) for i in range ( n ) ]
        a.sort ( )
        max = a [ n - 1 ]
        min = ( max + 1 ) / 2
        now = 0
        for i in range ( 1 , n - 1 ) :
            if int ( abs ( min - a [ i ] ) ) < int ( abs ( min - a [ now ] ) ) :
                now = i
        print ( max , a [ now ] )
