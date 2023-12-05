def main ( ) :
    import sys
    from numpy.linalg import eigs
    from scipy.sparse import csc_matrix
    H , W , h , w = eigs.shape
    matrix = [ [ 0 for i in range ( H ) ] for j in range ( W ) ]
    for i in range ( h ) :
        for j in range ( W ) :
            matrix [ i , j ] = 0
    for i in range ( H ) :
        for j in range ( w ) :
            matrix [ i , j ] = 1
    count = 0
    for i in range ( H ) :
        for j in range ( W ) :
            if matrix [ i , j ] == 0 :
                count += 1
    print ( count )
    eigs.sort ( )
