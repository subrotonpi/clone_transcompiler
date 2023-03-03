def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import sin , cos , cos , log
    from math import log
    from math import log
    n = randint ( 1 , 10000 )
    c = [ 0 ] * n
    s = [ 0 ] * n
    f = [ 0 ] * n
    for i in range ( n - 1 ) :
        c [ i ] = log ( i )
        s [ i ] = log ( i )
        f [ i ] = log ( i )
    for i in range ( n ) :
        ans = s [ i ] + c [ i ]
        for j in range ( i + 1 , n - 1 ) :
            ans += ( f [ j ] - ( ans % f [ j ] ) ) % f [ j ]
            ans = max ( ans , s [ j ] )
            ans += c [ j ]
        print ( ans )
