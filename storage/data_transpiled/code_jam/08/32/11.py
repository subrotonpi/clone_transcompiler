def _solve ( s ) :
    import sys
    from math import sin , cos , exp
    class B ( object ) :
        def helper ( d , s , start , r2 , r3 , r5 , r7 ) :
            if d [ start ] [ r2 ] [ r3 ] [ r5 ] [ r7 ] :
                return d [ start ] [ r2 ] [ r3 ] [ r5 ] [ r7 ]
            d [ start ] [ r2 ] [ r3 ] [ r5 ] [ r7 ] = 0
            m2 , m3 , m5 , m7 = 0 , 0 , 0 , 0
            for i in range ( start , len ( s ) ) :
                m2 = ( m2 * 10 + ord ( s [ i ] ) - '0' ) % 2
                m3 = ( m3 * 10 + ord ( s [ i ] ) - '0' ) % 3
                m5 = ( m5 * 10 + ord ( s [ i ] ) - '0' ) % 5
                m7 = ( m7 * 10 + ord ( s [ i ] ) - '0' ) % 7
                if i < len ( s ) - 1 :
                    d [ start ] [ r2 ] [ r3 ] [ r5 ] [ r7 ] = d [ start ] [ r2 ] [ r3 ] [ r5 ] [ r7 ] + helper ( d , s , i + 1 , ( r2 - m2 + 2 ) % 2 , ( r3 - m3 + 3 ) % 3 , ( r5 - m5 + 5 ) % 5 , ( r7 - m7 + 7 ) % 7 )
                    d [ start ] [ r2 ] [ r3 ] [ r5 ] [ r7 ] = d [ start ] [ r2 ] [ r3 ] [ r5 ] [ r7 ] + helper ( d , s , i + 1 , ( m2 - r2 + 2 ) % 2 , ( m3 - r3 + 3 ) % 3 , ( m5 - m5 + 5 ) % 5 , ( m7 - m7 + 7 ) % 7 )
                else :
                    if m2 == r2 or m3 == r3 or m5 == r5 or m7 == r7 :
                        d [ start ] [ r2 ] [ r3 ] [ r5 ] [ r7 ] = d [ start ] [ r2 ] [ r3 ] [ r5 ] [ r7 ] + helper ( d , s , i + 1 , ( m2 - r2