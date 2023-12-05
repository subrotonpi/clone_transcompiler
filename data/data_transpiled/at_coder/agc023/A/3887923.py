def main ( _ ) :
    import sys
    from collections import defaultdict
    from random import randint
    from time import sleep
    sc = raw_input ( )
    n = sc.__next__ ( )
    a = [ 0 ] * ( n + 1 )
    m = defaultdict ( int )
    m [ a [ 0 ] ] = 0
    for i in range ( 1 , n + 1 ) :
        a [ i ] = a [ i - 1 ] + randint ( 1 , n )
        m [ a [ i ] ] = 0
    ans = 0
    for i in range ( 0 , n ) :
        ans += m [ a [ i ] ]
        m [ a [ i ] ] = m [ a [ i ] ] + 1
    print ( ans )
