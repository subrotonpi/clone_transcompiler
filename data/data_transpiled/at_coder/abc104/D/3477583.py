def main ( ) :
    import sys
    from itertools import repeat
    sc = sys.stdin
    S = sc.read ( )
    mod = 1000000007L
    ABC = 'ABC'
    dp = [ [ ] for i in range ( len ( S ) ) ]
    if S [ 0 ] == '?' :
        dp [ 0 ] [ 0 ] = 3
    else :
        dp [ 0 ] [ 0 ] = 1
    if S [ 0 ] == 'A' or S [ 0 ] == '?' :
        dp [ 0 ] [ 1 ] = 1
    for i in range ( 1 , len ( S ) ) :
        for j in range ( 4 ) :
            if j == 0 :
                if S [ i ] == 'A' or S [ i ] == 'B' or S [ i ] == 'C' :
                    dp [ i ] [ 0 ] = dp [ i - 1 ] [ 0 ]
                else :
                    dp [ i ] [ 0 ] = dp [ i - 1 ] [ 0 ] * 3L
                dp [ i ] [ j ] %= mod
            else :
                x = ( 3L if S [ i ] == '?' else 1 )
                y = ( ( S [ i ] == ABC [ j - 1 ] or S [ i ] == '?' ) and 1 or 0L )
                dp [ i ] [ j ] = ( dp [ i - 1 ] [ j ] * x ) + ( dp [ i - 1 ] [ j - 1 ] * y )
                dp [ i ] [ j ] %= mod
    print ( dp [ - 1 ] [ 3 ] )
