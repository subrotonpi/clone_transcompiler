def main ( ) :
    import sys
    import math
    from numpy.testing.utils import get_filesystem_file
    f = open ( sys.argv [ 1 ] )
    n = int ( f.readline ( ) )
    max = 0
    for i in range ( n ) :
        arr = f.readline ( ).split ( ) [ : 5 ]
        sum = 0
        for j in range ( 5 ) :
            x = int ( arr [ j ] )
            if j < 4 :
                sum += x
            else :
                sum += float ( x ) * ( 110.0 / 900.0 )
        if max < sum :
            max = sum
    print ( max )
