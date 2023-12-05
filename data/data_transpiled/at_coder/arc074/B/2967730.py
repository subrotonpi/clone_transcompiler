def main ( ) :
    import sys
    from collections import deque
    from random import randint
    from time import time
    from math import radians
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    n = int ( sys.stdin.read ( ) )
    a = [ ]
    for i in range ( 3 * n ) :
        a.append ( randint ( 1 , n ) )
    score = 0
    left_queue = deque ( )
    right_queue = deque ( reversed ( list ( range ( n ) ) ) )
    for i in range ( n ) :
        left_queue.append ( a [ i ] )
        score += a [ i ]
        right_queue.append ( a [ 2 * n + i ] )
        score -= a [ 2 * n + i ]
    ds = [ 0 ] * ( n + 1 )
    d = 0
    for i in range ( 1 , n + 1 ) :
        left_queue.append ( a [ n + i - 1 ] )
        d += a [ n + i - 1 ] - left_queue.popleft ( )
        ds [ i ] += d
    d = 0
    for i in range ( 1 , n + 1 ) :
        right_queue.append ( a [ 2 * n - i ] )
        d += right_queue.popleft ( ) - a [ 2 * n - i ]
        ds [ n - i ] += d
    maxds = ds [ 0 ]
    for i in range ( 1 , n + 1 ) :
        maxds = max ( maxds , ds [ i ] )
    print ( score , maxds )
