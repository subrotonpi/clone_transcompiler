def main ( ) :
    import sys
    from itertools import islice
    from itertools import islice
    from itertools import chain
    n = len ( sys.stdin )
    k = len ( sys.stdin )
    cnt = [ 0 ] * n
    for i in range ( n ) :
        m = islice ( sys.stdin , i ) - 1
        cnt [ m ] += 1
    que = islice ( chain ( [ n ] , n ) , n )
    ans = 0
    while len ( que ) > k :
        ans += que.pop ( )
    print ( ans )
