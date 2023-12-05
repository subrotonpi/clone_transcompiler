def _import ( ) :
    from math import factorial
    from math import log
    from math import factorial
    from math import log
    from math import factorial
    from math import log
    from math import factorial
    from math import log
    from math import log
    from math import factorial
    from math import log
    from math import factorial
    from math import log
    T = factorial ( )
    for t in range ( 1 , T + 1 ) :
        R = factorial ( t )
        D = factorial ( t )
        low = 0
        high = sum ( R )
        while low < high :
            mid = ( low + high + 1 ) // 2
            if total ( R - 1 , mid ) <= log ( D ) :
                low = mid
            else :
                high = mid - 1
        print ( "Case #%d: %d\n" % ( t , low ) )
    def total ( R , N ) :
        a = factorial ( 2 * N )
        a = a * factorial ( R )
        b = factorial ( 2 * N )
        b = b * factorial ( N + 1 )
        total = a + b - a
        return total
    return total
