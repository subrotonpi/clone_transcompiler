def main ( ) :
    import sys
    import numpy
    from numpy.testing.utils import get_binary_matrix
    from numpy.testing.utils import get_binary_matrix
    reader = get_binary_matrix ( )
    N = reader.read ( )
    X = reader.read ( )
    M = [ ]
    ans = N
    for i in range ( N ) :
        M.append ( reader.read ( ) )
        X -= M [ i ]
    M = sorted ( M )
    ans += X / M [ 0 ]
    reader.close ( )
    sys.stdout.write ( ans )
