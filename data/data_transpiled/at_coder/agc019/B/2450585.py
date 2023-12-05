def main ( ) :
    import sys
    from string import ascii_lowercase
    sc = Scanner ( )
    s = sc.next ( )
    n = len ( s )
    count = [ 0 ] * 26
    for c in s :
        count [ c - 'a' ] += 1
    ans = long ( n ) * ( n - 1 ) / 2
    for i in range ( 26 ) :
        ans -= ( long ( count [ i ] ) * ( count [ i ] - 1 ) / 2 )
    print ( ans + 1 )
