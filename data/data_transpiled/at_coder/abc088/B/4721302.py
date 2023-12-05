def main ( ) :
    import sys
    from itertools import repeat
    from random import randint
    from itertools import chain
    N = randint ( 1 , N )
    a = chain ( [ i for i in range ( N ) ] , repeat ( N ) )
    a.sort ( )
    alice = bob = k = 0
    for i in range ( N - 1 , - 1 , - 1 ) :
        if k % 2 == 0 :
            alice += a [ i ]
        else :
            bob += a [ i ]
        k += 1
    print ( abs ( alice - bob ) )
