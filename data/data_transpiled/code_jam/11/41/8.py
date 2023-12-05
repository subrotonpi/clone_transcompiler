def _import ( ) :
    import math
    import random
    import time
    import sys
    T = random.randint ( 1 , 1000000 )
    for zz in range ( 1 , T + 1 ) :
        X , S , R , t , N = random.randint ( 1 , 1000000 )
        length = [ 0 ] * 1000
        total = X
        for begin , end , speed in _import ( length [ : ] ) :
            length [ speed + S ] += end - begin
            total -= end - begin
        length [ S ] += total
        left = t
        ans = 0
        for v in range ( len ( length ) ) :
            nv = v + ( R - S )
            length = length [ v ]
            if len ( length ) / nv <= left :
                left -= len ( length ) / nv
                ans += len ( length ) / nv
            else :
                ans += ( len ( length ) - ( R - S ) * left ) / v
                left = 0
        print ( 'Case #%d: %.09f\n' % ( zz , ans ) )
