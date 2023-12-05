def _import ( ) :
    import os
    import math
    import os
    import math
    import os
    import math
    import os
    import sys
    import math
    import random
    import math
    f = open ( 'A-large.in' , 'r' )
    f = open ( 'A-large.out' , 'w' )
    num = int ( f.readline ( ) )
    for z in range ( 1 , num + 1 ) :
        sp = f.readline ( ).split ( )
        trees = int ( sp [ 0 ] )
        A , B , C , D = [ int ( i ) for i in range ( 1 , 3 ) ]
        X , Y , M = [ int ( i ) for i in sp [ 1 : ] ]
        mod3 = [ [ ] for _ in range ( 3 ) ]
        for i in range ( trees ) :
            mod3 [ int ( X % 3 ) ] [ int ( Y % 3 ) ] += 1
            X = ( A * X + B ) % M
            Y = ( C * Y + D ) % M
        out = 0
        for i in range ( 9 ) :
            for j in range ( i ) :
                for k in range ( j ) :
                    a , b , c , d , e , f = i // 3 , j // 3 , j // 3 , k // 3 , k % 3
                    if ( a + c + e ) % 3 :
                        continue
                    if ( b + d + f ) % 3 :
                        continue
                    t = long ( mod3 [ a ] [ b ] )
                    if i == j :
                        t *= mod3 [ c ] [ d ] - 1
                        t /= 2
                        if j == k :
                            t *= mod3 [ e ] [ f ] - 2
                            t /= 3
                    else :
                        t *= mod3 [ c ] [ d ]
                        if j == k :
                            t *= mod3 [ e ] [ f ] - 1
                            t /= 2
                    else :
                        t *= mod3 [ e ] [ f ]
        f.write ( 'Case #%d: %d\n' % ( z , out ) )
