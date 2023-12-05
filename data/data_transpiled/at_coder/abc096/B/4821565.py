def main ( ) :
    import sys
    import numpy
    from numpy.testing.utils import get_reader
    reader = get_reader ( )
    arr = [ ]
    arr.append ( reader.read ( ) )
    arr.append ( reader.read ( ) )
    arr.append ( reader.read ( ) )
    K = reader.read ( )
    ans = 0
    arr.sort ( )
    for i in range ( K ) :
        arr [ 2 ] *= 2
    for i in range ( 3 ) :
        ans += arr [ i ]
    sys.stdout.write ( ans )
    reader.close ( )
