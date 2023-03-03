def __main ( ) :
    import sys
    from math import sqrt
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    T = log ( 1 )
    for zz in range ( 1 , T + 1 ) :
        S = sys.stdin.read ( )
        v = nv = 0
        for i in range ( len ( S ) ) :
            at = len ( S ) - i - 1
            if S [ i ] == '?' :
                nv |= 1 << at
            elif S [ i ] == '1' :
                v |= 1 << at
        ans = 0
        for c in range ( nv , len ( S ) ) :
            test = v + c
            if issquare ( test ) :
                ans = test
                break
            if not c :
                break
        print ( "Case #%d: %s\n" % ( zz , log ( ans ) ) )
    def issquare ( t ) :
        low = 1
        high = sys.maxsize
        while low <= high :
            mid = ( low + high ) // 2
            v = log ( mid )
            if v == t :
                return True
            if v < t :
                low = mid + 1
            else :
                high = mid - 1
        return False
    log ( 1 )
