def _import ( ) :
    from math import sin , cos , exp
    from os import urandom
    x = urandom ( 1 )
    seen = [ 1 ]
    for i in range ( 2 , 33 ) :
        for j in range ( 2 , 100 ) :
            if pow ( i , j ) > x :
                break
            seen.append ( int ( pow ( i , j ) ) )
    ans = 1
    for n in seen :
        if n > x :
            break
        ans = n
    return ans
