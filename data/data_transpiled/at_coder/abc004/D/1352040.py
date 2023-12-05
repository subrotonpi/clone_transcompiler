def import import sys
import math
import os
import math
import math
import sys
import math
import sys
import math
import sys
yo = [ int ( x ) for x in sys.stdin.readlines ( ) ]
r , g , b = yo [ 0 ] , yo [ 1 ] , yo [ 2 ]
ans = 1252521830252521L
OH = 1500
arr = [ ]
for gl in [ - 1000 , 700 ] :
    cnt = 0
    for i in range ( g ) :
        cnt += abs ( gl + i )
    def f ( i ) :
        p = gl - 1 - i
        arr.append ( abs ( p - ( - 100 ) ) )
        arr.sort ( )
        for i in range ( r ) :
            cnt += arr [ i ]
    def f ( i ) :
        p = gl + g + i
        arr.append ( abs ( p - ( 100 ) ) )
        arr.sort ( )
        for i in range ( b ) :
            cnt += arr [ i ]
    ans = min ( ans , cnt )
print ( ans )
