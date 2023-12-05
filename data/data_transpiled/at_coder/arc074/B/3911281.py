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
    n = randint ( 1 , 3 * n )
    a = [ ]
    for i in range ( 3 * n ) :
        a.append ( randint ( 1 , 3 * n ) )
    aa = [ ]
    bb = [ ]
    queue1 = deque ( )
    queue2 = deque ( ( x , y ) for x , y in zip ( a , a [ 1 : ] ) )
    sum = 0
    for i in range ( n ) :
        queue1.append ( a [ i ] )
        sum += a [ i ]
    aa.append ( sum )
    for i in range ( 1 , n + 1 ) :
        v = queue1.popleft ( )
        if a [ i + n - 1 ] > v :
            queue1.append ( a [ i + n - 1 ] )
            sum += a [ i + n - 1 ] - v
        else :
            queue1.append ( v )
        aa.append ( sum )
    sum = 0
    for i in range ( 2 * n , 3 * n ) :
        queue2.append ( a [ i ] )
        sum += a [ i ]
    bb.append ( sum )
    for i in range ( 1 , n + 1 ) :
        v = queue2.popleft ( )
        if v > a [ 2 * n - i ] :
            queue2.append ( a [ 2 * n - i ] )
            sum += a [ 2 * n - i ] - v
        else :
            queue2.append ( v )
        bb.append ( sum )
    res = 0
    for i in range ( 0 , n ) :
        v = aa [ i ] - bb [ n - i ]
        res = max ( res , v )
    print ( res )
