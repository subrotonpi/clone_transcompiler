def main ( ) :
    import math
    import numpy
    from numpy.linalg import getAngle
    from numpy.random import randint
    from numpy.random import uniform
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    N = randint ( 1 , N )
    pos = [ Point ( i , randint ( 1 , N ) , randint ( 1 , N ) ) for i in range ( N ) ]
    print ( 'pos = ' , pos )
    acute_angle = right_angle = obtuse_angle = 0
    for i in range ( N ) :
        angles = [ ]
        tmp_j = [ ]
        for j in range ( N ) :
            if j == i :
                continue
            angles.append ( getAngle ( pos [ i ] , pos [ j ] ) )
        for j in range ( N - 1 ) :
            angles.append ( angles [ j ] + math.pi * 2 )
        angles.sort ( )
        for j in range ( N - 1 ) :
            t1 = 0
            for k in range ( tmp_j ) :
                if k < angles [ t1 ] < angles [ j ] + math.pi / 2 - 1e-9 :
                    t1 += 1
                t2 = t1
                for k in range ( t1 , tmp_j ) :
                    if k < angles [ t2 ] < angles [ j ] + math.pi / 2 + 1e-9 :
                        t2 += 1
                    t3 = t2
                    for k in range ( t2 , tmp_j ) :
                        if k < angles [ t3 ] < angles [ j ] + math.pi - 1e-9 :
                            t3 += 1
                right_angle += t2 - t1
                obtuse_angle += t3 - t2
        acute_angle = long ( N ) * ( N - 1 ) * ( N - 2 ) / 6 - right_angle - obtuse_angle
        assert_almost_equal ( acute_angle , right_angle , obtuse_angle )
    class Point ( Point ) :
        def __init__ ( self , x , y ) :
            self.id = x
            self.x = x
            self.y = y
