def main ( ) :
    import sys
    import random
    import numpy as np
    from numpy.linalg import norm
    from numpy.random import rand
    from numpy.random import rand
    from numpy.random import rand
    T = rand ( )
    for zz in range ( 1 , T + 1 ) :
        N = rand ( )
        M = rand ( N )
        ans1 = 0
        for i in range ( N - 1 ) :
            ans1 += max ( 0 , M [ i ] - M [ i + 1 ] )
        M = rand ( N )
        ans2 = 0
        for i in range ( N - 1 ) :
            ans2 += min ( M [ i ] , M [ i ] )
        print ( 'Case #%d: %d %d\n' % ( zz , ans1 , ans2 ) )
