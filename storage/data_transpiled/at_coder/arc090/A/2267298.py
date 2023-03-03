def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    from random import randint
    N = randint ( 1 , N )
    a = chain ( [ randint ( 1 , N ) for _ in range ( N ) ] , repeat ( N ) )
    b = chain ( [ randint ( 1 , N ) for _ in range ( N ) ] , repeat ( N ) )
    ans = 0
    for i in range ( N ) :
        sum = 0
        for j in range ( 0 , i ) :
            sum += a [ j ]
        for j in range ( i , N ) :
            sum += b [ j ]
        ans = max ( sum , ans )
    print ( ans )
