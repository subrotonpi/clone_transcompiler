def _import ( ) :
    from itertools import chain
    from itertools import chain
    G = [ ]
    next = [ ]
    i = 0
    j = 0
    while G [ i ] == 0 :
        sum = g [ i ]
        for j in chain ( ( i + 1 ) % len ( g ) for i in range ( j ) ) :
            sum += g [ j ]
        G.append ( sum )
        next.append ( j )
        i = j
    m = [ False ] * len ( g )
    p = start = 0
    sr = 0
    while not m [ p ] :
        start += G [ p ]
        m [ p ] = True
        sr += 1
        p = next [ p ]
    q = p
    rsum = 0
    rr = 0
    [ m ] = False
    while not m [ q ] :
        rsum += G [ q ]
        m [ q ] = True
        rr += 1
        q = next [ q ]
    if R <= sr :
        res = 0
        sr = 0
        p = 0
        while sr < R :
            res += G [ p ]
            sr += 1
            p = next [ p ]
        return res
    else :
        res = start
        R -= sr
        res += ( R / rr ) * rsum
        left = R % rr
        for i in range ( left ) :
            res += G [ p ]
            p = next [ p ]
        return res
