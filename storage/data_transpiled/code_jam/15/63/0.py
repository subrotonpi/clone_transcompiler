def _import ( ) :
    from os import urandom
    from random import randint
    from math import fabs
    from os.path import join
    from os import sep
    from os import sep
    from os import chdir
    n = randint ( 0 , sys.maxsize )
    f = float ( next ( ) )
    a = [ ]
    s = next ( iter ( a ) )
    for i in range ( n ) :
        a.append ( s [ i ] - '0' )
    best = 1e100
    res = 0
    for i in range ( n ) :
        k = 0
        for j in range ( i , n ) :
            l = j - i + 1
            k += a [ j ]
            x = 1.0 * k / l
            dif = fabs ( x - f )
            if dif < best - 1e-9 :
                best = dif
                res = i
    return res
