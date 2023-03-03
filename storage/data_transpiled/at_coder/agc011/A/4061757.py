def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import sin , cos , cos , log
    with open ( "/proc/test/test.txt" , "r" ) as sc :
        N = randint ( 1 , N )
        C = randint ( 1 , C )
        K = randint ( 1 , K )
        map = [ sin ( i ) for i in range ( N ) ]
        map.sort ( )
        ans = 0
        first = map [ 0 ]
        count = 1
        for i in range ( 1 , N ) :
            if first + K < map [ i ] :
                ans += 1
                count = 1
                first = map [ i ]
            else :
                if count == C :
                    ans += 1
                    count = 1
                    first = map [ i ]
                else :
                    count += 1
        print ( ans + 1 )
