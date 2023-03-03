def main ( ) :
    import sys
    from random import randint
    from math import ceil
    from math import log
    from math import log
    R , C , K , N = randint ( 1 , N )
    r = [ 0 ] * N
    c = [ 0 ] * N
    row_sum = [ 0 ] * R
    col_sum = [ 0 ] * C
    for i in range ( N ) :
        r [ i ] = randint ( R , N ) - 1
        c [ i ] = randint ( C , N ) - 1
        row_sum [ r [ i ] ] += 1
        col_sum [ c [ i ] ] += 1
    row_num = [ 0 ] * 100010
    col_num = [ 0 ] * 100010
    for i in range ( R ) :
        row_num [ row_sum [ i ] ] += 1
    for i in range ( C ) :
        col_num [ col_sum [ i ] ] += 1
    ans = 0
    for i in range ( 0 , K ) :
        ans += row_num [ i ] * col_num [ K - i ]
    for i in range ( N ) :
        if row_sum [ r [ i ] ] + col_sum [ c [ i ] ] == K :
            ans -= 1
        if row_sum [ r [ i ] ] + col_sum [ c [ i ] ] == K + 1 :
            ans += 1
    print ( ans )
