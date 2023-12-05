def main ( ) :
    import sys
    from collections import deque
    from random import randint
    from itertools import chain
    sc = raw_input ( )
    N = sc.__next__ ( )
    K = sc.__next__ ( )
    sc.next ( )
    s = sc.next ( ).split ( )
    n = [ int ( i ) for i in s ]
    pq = deque ( [ MyComp ( ) ] )
    f = sys.stdout
    for i in range ( N ) :
        pq.append ( [ i + 1 , n [ i ] ] )
        if i >= K - 1 :
            if i >= K : pq.popleft ( )
            p = pq.popleft ( )
            f.write ( p )
            pq.append ( p )
