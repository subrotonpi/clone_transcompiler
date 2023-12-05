def main ( ) :
    import sys
    import os
    from numpy.testing import assert_almost_equal
    f = open ( "/proc/stb/dev/tty.py" , "r" )
    arr = f.readline ( ).split ( ) [ : 3 ]
    r , c , d = [ int ( i ) for i in arr [ 0 ].split ( ) ]
    field = [ [ int ( i ) for i in line.split ( ) ] for line in f.readlines ( ) ]
    max = 0
    for i in range ( r ) :
        for j in ( 0 if ( d - i ) % 2 == 0 ) :
            x = field [ i ] [ j ]
            if max < x :
                max = x
    assert_almost_equal ( max , 0 )
