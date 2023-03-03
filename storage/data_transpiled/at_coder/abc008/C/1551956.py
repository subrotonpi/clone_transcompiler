def main ( ) :
    import sys
    from math import sin , cos , pi
    from os import urandom
    N = urandom ( 1 )
    C = [ sin ( i ) for i in range ( N ) ]
    print ( C )
    ans = 0
    for i in range ( N ) :
        S = 0
        for j in range ( N ) :
            if j != i and C [ i ] % C [ j ] == 0 :
                S += 1
        if S % 2 == 0 :
            ans += float ( S + 2 ) / float ( 2 * S + 2 )
        else :
            ans += float ( 1 ) / float ( 2 )
    print ( ans )
