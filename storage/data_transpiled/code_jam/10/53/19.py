def main ( ) :
    import os
    import numpy as np
    import random
    import time
    import os
    import sys
    arr = np.zeros ( ( 1 , 22 ) )
    cost = [ 0 ] * ( 1 << 20 )
    for i in range ( 1 , ( 1 << 20 ) ) :
        cost [ i ] = cost [ i - 1 ] + i * i
    s = os.popen ( 'C.in' )
    T = s.read ( )
    for tc in range ( 1 , T + 1 ) :
        C = s.read ( )
        arr = [ ]
        for i in range ( C ) :
            arr [ s.read ( ) + 2000000 ] = s.read ( )
        ans = 0
        ok = False
        while not ok :
            ok = True
            for i in range ( 4000000 ) :
                if arr [ i ] > 1 :
                    ok = False
                    j = i
                    while arr [ j ] >= arr [ i ] : j += 1
                    j -= 1
                    if ( j - i ) % 2 == 1 : j -= 1
                    v = arr [ i ]
                    val = v * ( j - i + 1 )
                    loc = ( i + j ) / 2
                    ans -= v * cost [ ( j - i + 1 ) / 2 ]
                    ans += cost [ val / 2 ]
                    for k in range ( i , j + 1 ) :
                        arr [ k ] -= v
                    for shift in range ( 0 , val // 2 ) :
                        if shift == 0 and val % 2 == 1 : arr [ loc ] += 1
                        if shift > 0 :
                            arr [ loc + shift ] += 1
                            arr [ loc - shift ] += 1
        print ( 'Case #%d: %d' % ( tc , ans ) )
