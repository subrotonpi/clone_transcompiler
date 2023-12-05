def main ( ) :
    import sys
    from itertools import repeat
    with open ( sys.argv [ 1 ] ) as f :
        s = f.read ( ).decode ( 'utf-8' )
    n = len ( s )
    dp = [ [ 1 if i == 3 else 0 for i in range ( n + 1 ) ] for i in range ( 0 , 3 ) ]
    for i in range ( n - 1 , - 1 , - 1 ) :
        for j in range ( 3 , - 1 , - 1 ) :
            dp [ i ] [ j ] = dp [ i + 1 ] [ j ] * ( 3L if s [ i ] == '?' else 1 )
            if j < 3 and ( s [ i ] == '?' or s [ i ] == 'ABC'.decode ( 'utf-8' ) [ j ] ) :
                dp [ i ] [ j ] += dp [ i + 1 ] [ j + 1 ]
            dp [ i ] [ j ] %= 1_000_000_007L
    print ( dp [ 0 ] [ 0 ] )
