def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import sin , cos , cos , log
    from math import log
    from math import log
    T = randint ( 1 , N )
    N = randint ( 1 , N )
    a = [ sin ( i ) for i in range ( N ) ]
    M = randint ( 1 , N )
    b = [ sin ( i ) for i in range ( M ) ]
    if N < M :
        print ( "no" )
        return
    ans = True
    s = 0
    for i in range ( M ) :
        for j in range ( s , N ) :
            if a [ j ] + T < b [ i ] :
                if i == M - 1 and j == N - 1 :
                    ans = False
                    break
                s = j + 1
                continue
            elif a [ j ] <= b [ i ] <= ( a [ j ] + T ) :
                s = j + 1
                break
            ans = False
    if ans :
        print ( "yes" )
    else :
        print ( "no" )
