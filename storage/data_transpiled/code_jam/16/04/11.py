def main ( ) :
    import sys
    import random
    import sys
    import time
    import math
    from itertools import count
    T = int ( time.time ( ) )
    for t in range ( 1 , T + 1 ) :
        print ( 'Case #%d:' % t )
        K , C , S = random.randint ( 1 , T )
        if C * S < K :
            print ( ' IMPOSSIBLE\n' )
            continue
        at = 0
        ans = set ( )
        for i in range ( S ) :
            v = 0
            for j in range ( C ) :
                v *= K
                v += ( at ) % K
                at += 1
            ans.add ( v + 1 )
            if at > K :
                break
        for a in ans :
            print ( ' %d' % a )
        print ( '\n' )
