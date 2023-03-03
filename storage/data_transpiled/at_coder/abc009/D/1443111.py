def main ( ) :
    import sys
    from numpy.linalg import eigs
    from numpy.random import rand
    from scipy.sparse import csc_matrix
    from scipy.sparse import csc_matrix
    from scipy.sparse.linalg import eigs
    from scipy.sparse import csc_matrix
    from scipy.sparse.linalg import eigs
    from scipy.sparse.linalg import eigs
    K = rand ( )
    M = rand ( )
    a = [ [ ] for _ in range ( K ) ]
    c = [ [ ] for _ in range ( K ) ]
    a = [ [ ] for _ in range ( K ) ]
    c = [ [ ] for _ in range ( K ) ]
    a = [ [ ] for _ in range ( K ) ]
    matrix = csc_matrix ( a )
    current = [ [ ] for _ in range ( K ) ]
    result = [ [ ] for _ in range ( K ) ]
    for y in range ( K ) :
        for x in range ( K ) :
            current [ y ] [ x ] = matrix [ y ] [ x ] if y == 0 else [ ] if y - 1 == x else [ ]
            result [ y ] [ x ] = [ ] if x == y else [ ]
    for i in range ( ( M - K ) ) :
        if i % 2 == 1 :
            result = eigs ( result , current )
        current = eigs ( current , current )
    ans = a [ K - M ] [ 0 ] if M <= K else [ ]
    print ( ans )
    def and_ ( a , b ) :
        h , w = a.shape
        result = [ ]
        for y in range ( h ) :
            for x in range ( w ) :
                for i in range ( a.shape [ 0 ] ) :
                    result [ y ] [ x ] = result [ y ] [ x ] ^ ( a [ y ] [ i ] & b [ i ] )
        return result
    return and_
