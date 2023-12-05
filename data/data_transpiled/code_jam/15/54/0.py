def _import ( ) : return int ( next ( sys.stdin ) )
def _solve ( ) :
    p = randint ( 1 , 10000 )
    e = [ ]
    f = [ ]
    for i in range ( p ) :
        e.append ( randint ( 1 , 10000 ) )
    for i in range ( p ) :
        f.append ( randint ( 1 , 10000 ) )
    _min = e [ 0 ]
    for i in range ( p ) :
        e [ i ] -= _min
    s = [ ]
    n = 0
    t = [ ]
    pr = [ ]
    for i in range ( p ) :
        while t [ i ] < f [ i ] :
            if i == 0 and t [ i ] == 0 :
                t [ i ] += 1
            else :
                s.append ( e [ i ] )
                jj = p - 1
                for j in range ( p - 1 , - 1 , - 1 ) :
                    if t [ j ] > 0 :
                        ee = e [ j ] + e [ i ]
                        while e [ jj ] > ee : jj -= 1
                        t [ jj ] += t [ j ]
                        pr.append ( j )
    for i in range ( p ) :
        if e [ i ] == - _min :
            while i > 0 :
                j = pr [ i ]
                d = i - j
                for q in range ( n ) :
                    if s [ q ] == d :
                        s [ q ] = - d
                        break
                i = j
            break
    s.sort ( )
    res = [ ]
    for i in range ( n ) :
        if i > 0 : res.append ( '' )
        res.append ( s [ i ] )
    return ''.join ( res )
