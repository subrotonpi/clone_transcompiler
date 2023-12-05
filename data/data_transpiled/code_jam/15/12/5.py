def main ( ) :
    import sys
    import random
    import time
    random.seed ( 0 )
    T = random.randint ( 1 , 10000 )
    for zz in range ( 1 , T + 1 ) :
        B = random.randint ( 1 , 10000 )
        N = random.randint ( 1 , 10000 )
        M = [ random.randint ( 1 , 10000 ) for _ in range ( B ) ]
        start = end = long ( 1e16 )
        while start < end :
            mid = ( start + end ) // 2
            count = 0
            for t in M :
                count += ( mid // t ) + 1
            if count >= N :
                end = mid
            else :
                start = mid + 1
        count = 0
        exact = 0
        for t in M :
            count += ( start // t ) + 1
            if start % t == 0 :
                exact += 1
        before = count - exact
        ans = - 1
        for i in range ( B ) :
            if start % M [ i ] != 0 :
                continue
            if before + 1 == N :
                ans = i
                break
            before += 1
        print ( 'Case #%d: %d\n' % ( zz , ans + 1 ) )
