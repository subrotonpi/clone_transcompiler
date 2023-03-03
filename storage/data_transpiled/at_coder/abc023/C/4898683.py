def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from itertools import chain
    R = range ( randint ( 1 , 10000 ) )
    C = range ( randint ( 1 , 10000 ) )
    k = range ( randint ( 1 , 10000 ) )
    n = range ( randint ( 1 , 10000 ) )
    r = [ 0 ] * n
    c = [ 0 ] * n
    cntr = [ 0 ] * R
    cntc = [ 0 ] * C
    for i in chain ( r , c ) :
        r [ i ] = randint ( 1 , 10000 ) - 1
        c [ i ] = randint ( 1 , 10000 ) - 1
        cntr [ r [ i ] ] += 1
        cntc [ c [ i ] ] += 1
    sys.stdout.write ( "\n" )
    cntr2 = [ 0 ] * 100001
    cntc2 = [ 0 ] * 100001
    for i in range ( len ( cntr ) ) :
        cntr2 [ cntr [ i ] ] += 1
    for i in range ( len ( cntc ) ) :
        cntc2 [ cntc [ i ] ] += 1
    ans = 0
    for i in range ( 0 , k ) :
        ans += cntr2 [ i ] * cntc2 [ k - i ]
    for i in range ( n ) :
        if cntr [ r [ i ] ] + cntc [ c [ i ] ] == k :
            ans -= 1
        elif cntr [ r [ i ] ] + cntc [ c [ i ] ] == k + 1 :
            ans += 1
    print ( ans )
