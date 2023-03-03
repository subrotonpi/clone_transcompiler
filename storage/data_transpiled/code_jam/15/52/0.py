def _solve_test ( ) :
    import os
    from sympy.utilities.iterables import solve
    from sympy.printing.debuglevel import debuglevel
    from sympy.printing.debuglevel import debuglevel
    from sympy.printing.debuglevel import debuglevel
    n = randint ( 1 , 10000 )
    k = randint ( 1 , 10000 )
    s = [ randint ( 1 , 10000 ) for i in range ( n - k + 1 ) ]
    h = [ 0 ] * k
    ss = 0
    for i in range ( k ) :
        c = min = max = 0
        for j in range ( i + k , n , k ) :
            c = c - s [ j - k ] + s [ j - k + 1 ]
            min = min ( min , c )
            max = max ( max , c )
        ss = ss - min
        h.append ( max - min )
    ss = ( s [ 0 ] - ss ) % k
    if ss < 0 :
        ss += k
    maxh = 0
    for i in range ( k ) :
        maxh = max ( maxh , h [ i ] )
    tt = 0
    for i in range ( k ) :
        tt += maxh - h [ i ]
    if ss <= tt :
        return maxh
    else :
        return maxh + 1
