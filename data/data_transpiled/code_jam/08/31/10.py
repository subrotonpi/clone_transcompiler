def _solve ( P , K , f ) :
    import sys
    from math import sqrt
    f = [ sqrt ( ( i + 1 ) / K ) for i in f ]
    t = 0
    j = 0
    for i in f [ : - 1 ] :
        t += ( ( j / K ) + 1 ) * f [ i ]
        j += 1
    return t
