def main ( ) :
    import sys
    from numpy.core import zeros
    from numpy.core import diff
    reader = zeros ( ( 6 , 3 ) )
    A = reader.read ( )
    B = reader.read ( )
    C = reader.read ( )
    gaps = zeros ( ( 6 , 3 ) )
    gaps [ 0 ] = abs ( A - B ) + abs ( B - C )
    gaps [ 1 ] = abs ( A - C ) + abs ( C - B )
    gaps [ 2 ] = abs ( B - A ) + abs ( A - C )
    gaps [ 3 ] = abs ( B - C ) + abs ( C - A )
    gaps [ 4 ] = abs ( C - A ) + abs ( A - B )
    gaps [ 5 ] = abs ( C - B ) + abs ( B - A )
    min = gaps [ 0 ]
    for i in range ( 1 , 6 ) :
        if gaps [ i ] < min :
            min = gaps [ i ]
    reader.close ( )
    sys.stdout.write ( min )
