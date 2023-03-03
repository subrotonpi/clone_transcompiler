def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    N = len ( sys.stdin.readlines ( ) )
    C = len ( sys.stdin.readlines ( ) )
    MAX = 100001
    s = [ ]
    t = [ ]
    c = [ ]
    for i in range ( N ) :
        s.append ( i )
        t.append ( i )
        c.append ( i - 1 )
    a = [ [ 0 ] * ( C [ MAX ] * ( MAX - len ( s ) ) ) for i in range ( N ) ]
    for i in range ( N ) :
        a [ c [ i ] ] [ s [ i ] - 1 ] += 1
        a [ c [ i ] ] [ t [ i ] ] -= 1
    for i in range ( C ) :
        for j in range ( 1 , MAX ) :
            a [ i ] [ j ] += a [ i ] [ j - 1 ]
    max = 0
    for i in range ( MAX ) :
        cnt = 0
        for j in range ( C ) :
            if a [ j ] [ i ] != 0 :
                cnt += 1
        max = max ( max , cnt )
    print ( max )
