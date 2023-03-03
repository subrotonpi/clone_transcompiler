def main ( ) :
    import sys
    from numpy import array
    from numpy.linalg import norm
    from numpy.random import choice
    from numpy.random import choice
    map = [ choice ( range ( 3 ) ) for _ in range ( 3 ) ]
    map2 = [ choice ( range ( 3 ) ) for _ in range ( 3 ) ]
    map2.sort ( )
    tmp = map2 [ 0 ]
    map2 [ 0 ] = map2 [ 2 ] = tmp
    for point in map :
        for i in range ( 1 , 3 ) :
            if point == map2 [ i - 1 ] :
                print ( i )
