def main ( ) :
    import sys
    from random import randint
    from numpy.testing import assert_array_almost_equal
    T = randint ( 1 , 5 )
    N = randint ( 1 , 5 )
    A = [ randint ( 1 , 5 ) for i in range ( N ) ]
    M = randint ( 1 , 5 )
    B = [ randint ( 1 , 5 ) for i in range ( M ) ]
    length = 0
    for i in range ( M ) :
        s = B [ i ]
        while True :
            if length >= N :
                print ( 'no' )
                return
            if s < A [ length ] or s > A [ length ] + T :
                length += 1
                continue
            length += 1
            break
    print ( 'yes' )
