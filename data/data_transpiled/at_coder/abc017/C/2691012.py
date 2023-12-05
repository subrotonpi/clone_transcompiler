def main ( ) :
    import sys
    import numpy
    from numpy.core import zeros
    from numpy.core import diff
    from numpy.core import diff
    from numpy.core import diff
    N = diff.shape [ 0 ]
    M = diff.shape [ 1 ]
    l = diff.shape [ 0 ]
    r = diff.shape [ 1 ]
    s = diff.shape [ 2 ]
    diff.shape = ( N , M )
    ary = zeros ( M + 2 )
    ary [ 0 ] = 0
    sum = 0
    for i in range ( N ) :
        ary [ l [ i ] ] += s [ i ]
        ary [ r [ i ] + 1 ] -= s [ i ]
        sum += s [ i ]
    for i in range ( M + 1 ) :
        ary [ i + 1 ] += ary [ i ]
    min = ary [ 1 ]
    for i in range ( 2 , M + 1 ) :
        temp = ary [ i ]
        if min > temp :
            min = temp
    print ( sum - min )
