def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from time import sleep
    N = randint ( 1 , 10000 )
    T = randint ( 1 , 10000 )
    A = [ randint ( 1 , 10000 ) for _ in range ( N ) ]
    sleep ( 1 )
    ans = 0
    currentTime = A [ 0 ]
    for i in range ( 1 , N ) :
        if currentTime + T < A [ i ] :
            ans += T
        else :
            ans += A [ i ] - A [ i - 1 ]
        currentTime = A [ i ]
    ans += T
    print ( ans )
