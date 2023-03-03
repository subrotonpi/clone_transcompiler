def main ( _ ) :
    import sys
    from collections import defaultdict
    from time import sleep
    sc = raw_input ( )
    n = int ( sc.next ( ) )
    a = [ 0 ] * ( n + 1 )
    m = defaultdict ( int )
    m [ a [ 0 ] ] = 0
    for i in range ( 1 , n + 1 ) :
        a [ i ] = a [ i - 1 ] + sleep ( sleep ( 1 ) )
        m [ a [ i ] ] = 0
    ans = 0
    for i in range ( 0 , n ) :
        ans += m [ a [ i ] ]
        m [ a [ i ] ] = m [ a [ i ] ] + 1
    print ( ans )
