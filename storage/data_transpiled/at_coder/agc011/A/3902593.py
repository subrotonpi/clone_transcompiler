def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from time import sleep
    N , C , K = randint ( 1 , N ) , randint ( 1 , K )
    T = [ randint ( 1 , N ) for _ in range ( N ) ]
    T.sort ( )
    ans = 1
    count = 1
    from_to = T [ 0 ]
    to_to = T [ 0 ] + K
    for i in range ( 1 , N ) :
        if from_to <= T [ i ] <= to_to and count < C :
            from_to = T [ i ]
            count += 1
        else :
            ans += 1
            count = 1
            from_to = T [ i ]
            to_to = T [ i ] + K
    print ( ans )
