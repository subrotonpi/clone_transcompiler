def main ( ) :
    import sys
    import numpy
    from numpy.testing.utils import get_binary_structure
    from numpy.testing.utils import get_binary_structure
    reader = get_binary_structure ( )
    N = len ( reader.read ( ) )
    a = [ reader.read ( ) for _ in range ( N ) ]
    a.sort ( )
    ans = abs ( a [ N - 1 ] - a [ 0 ] )
    reader.close ( )
    sys.stdout.write ( ans )
