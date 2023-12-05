def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from itertools import chain
    N = randint ( 1 , N )
    A_ = chain ( [ randint ( 1 , N ) for _ in range ( N ) ] )
    now = A_ [ 0 ]
    count = 1
    for i in range ( 1 , N ) :
        if now < A_ [ i ] :
            while i < N and now <= A_ [ i ] :
                now = A_ [ i ]
                i += 1
        elif now > A_ [ i ] :
            while i < N and now >= A_ [ i ] :
                now = A_ [ i ]
                i += 1
        else :
            i += 1
            continue
        if i < N :
            now = A_ [ i ]
            count += 1
    print ( count )
