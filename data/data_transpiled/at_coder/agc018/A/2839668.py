def main ( ) :
    import sys
    from numpy import arange
    from numpy.core import zeros
    from numpy.core import dot
    from numpy.linalg import eigs
    N = N
    K = N
    map = [ dot ( N , K ) for i in range ( N ) ]
    map = [ dot ( N , K ) for i in range ( N ) ]
    index = sum ( map )
    if index >= N :
        print ( "POSSIBLE" )
        return
    if ~ index >= N :
        print ( "IMPOSSIBLE" )
        return
    for i in range ( ( N - 1 ) ) :
        A = map [ i ]
        if all ( map [ A + 1 ] ) or all ( map [ A - 1 ] ) :
            print ( "POSSIBLE" )
            return
        if all ( map [ A + A + 1 ] ) or all ( map [ A - A - 1 ] ) :
            print ( "POSSIBLE" )
            return
        if A > K and all ( map [ A - K ] ) :
            print ( "POSSIBLE" )
            return
    print ( "IMPOSSIBLE" )
