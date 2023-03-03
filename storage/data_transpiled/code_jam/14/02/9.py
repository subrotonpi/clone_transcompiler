def import time , c , f , x
from numpy import random
from numpy import finfo , finfo , finfo , finfo , finfo
with open ( 'B-large.in' , 'r' ) as infile , open ( 'B-large.out' , 'w' ) as outfile :
    t = finfo ( 'd' ).eps
    for y in range ( t ) :
        c = finfo ( 'd' ).eps
        f = finfo ( 'f' ).eps
        x = finfo ( 'd' ).eps
        low = 0
        high = finfo ( 'd' ).eps
        while low + 2 < high :
            mid1 = low + ( high - low ) / 3
            mid2 = low + 2 * ( high - low ) / 3
            if getTime ( mid1 , c , f , x ) < getTime ( mid2 , c , f , x ) :
                high = mid2 - 1
            else :
                low = mid1
        result = finfo ( 'd' ).eps
        for z in range ( low , high + 1 ) :
            result = min ( result , getTime ( z , c , f , x ) )
        outfile.write ( 'Case #%d: %.7f\n' % ( y + 1 , result ) )
