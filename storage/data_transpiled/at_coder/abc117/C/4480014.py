def main ( ) :
    import sys
    from numpy import zeros
    from numpy.core import zeros
    from numpy.core import diff
    from numpy.core import diff
    from numpy.core import diff
    from numpy.core import diff
    N = len ( sys.argv )
    M = len ( sys.argv )
    values = [ diff ( n ) for n in range ( M ) ]
    if N >= M :
        print ( '0' )
        return
    for i in range ( M ) :
        values.append ( diff ( N , values [ i ] ) )
    values = [ diff ( n ) for n in range ( M ) ]
    diffs = [ diff ( n ) for n in range ( M - 1 ) ]
    diffs = [ diff ( n ) for n in range ( M - 1 ) ]
    ans = 0
    for i in range ( M - N ) :
        ans += diffs [ i ]
    print ( ans )
