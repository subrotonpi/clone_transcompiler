def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import sin , cos , log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import sin , cos , log
    from math import log
    n = randint ( 1 , 5 )
    k = randint ( 1 , 5 )
    h = [ sin ( x ) for x in range ( n ) ]
    h.sort ( )
    ans = sum ( [ sin ( x ) for x in h ] )
    for i in range ( n - k + 1 ) :
        d = h [ i + k - 1 ] - h [ i ]
        ans = min ( ans , d )
    print ( ans )
