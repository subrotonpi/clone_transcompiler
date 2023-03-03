def code_pyam2015 ( ) :
    import sys
    from itertools import count
    class B ( object ) :
        def __init__ ( self ) :
            self.T = count ( )
    for cases in range ( 1 , T + 1 ) :
        D = range ( 1 , D + 1 )
        P = [ B ( ) for _ in range ( D ) ]
        best = P [ 0 ]
        for i in range ( 1 , D ) :
            best = max ( best , i )
        for n in range ( 1 , best ) :
            s = 0
            for i in range ( D ) :
                s += ( P [ i ] % n ) or P [ i ] / n - 1
            if s + n < best :
                best = s + n
        print ( "Case #{}: {}".format ( cases , best ) )
