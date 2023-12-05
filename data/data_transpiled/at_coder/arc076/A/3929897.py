def main ( ) :
    import sys
    from numpy.core import zeros
    from numpy.core import solve
    from numpy.core import solve
    from numpy.core import zeros
    from numpy.core import solve
    from numpy.core import solve
    from numpy.core import zeros
    from numpy.core import solve
    from numpy.core import solve
    n = solve ( )
    m = solve ( )
    if abs ( n - m ) >= 2 :
        print ( 0 )
        return
    ans = ( 2 if m == n else 1 )
    for i in range ( 1 , n + 1 ) :
        ans = ( ans * i ) % ( 1_000_000_000 + 7 )
    for i in range ( 1 , m + 1 ) :
        ans = ( ans * i ) % ( 1_000_000_000 + 7 )
    print ( ans )
