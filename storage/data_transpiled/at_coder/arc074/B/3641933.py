def main ( ) :
    import sys
    from collections import deque
    from random import randint
    from math import log
    from math import radians
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    n = int ( sys.stdin.read ( ) )
    a = [ ]
    for i in range ( n * 3 ) :
        a.append ( randint ( 1 , 3 * n ) )
    a = [ ]
    ans = sum ( a )
    a1 = a [ : n ]
    a2 = a [ 2 * n : 3 * n ]
    p1 = deque ( ( x , y ) for x , y in p1 )
    p2 = deque ( ( x , y ) for x , y in p2 )
    sum1 = [ 0 ] * ( n + 1 )
    sum2 = [ 0 ] * ( n + 1 )
    for i in range ( n ) :
        p1.append ( a1 [ i ] )
        p2.append ( a2 [ i ] )
        sum1 [ 0 ] += a1 [ i ]
        sum2 [ 0 ] += a2 [ i ]
    for i in range ( n ) :
        c1 = a [ i + n ]
        m1 = p1.popleft ( )
        sum1 [ i + 1 ] = sum1 [ i ] - m1
        m1 = max ( c1 , m1 )
        sum1 [ i + 1 ] += m1
        p1.append ( m1 )
        c2 = a [ 2 * n - 1 - i ]
        m2 = p2.popleft ( )
        sum2 [ i + 1 ] = sum2 [ i ] - m2
        m2 = min ( c2 , m2 )
        sum2 [ i + 1 ] += m2
        p2.append ( m2 )
    for i in range ( n + 1 ) :
        ans = max ( ans , sum1 [ i ] - sum2 [ n - i ] )
    print ( ans )
