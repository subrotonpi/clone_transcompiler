def main ( ) :
    import sys
    import random
    N = random.randint ( 1 , 10000 )
    P = random.randint ( 1 , 10000 )
    ki = 0
    gu = 0
    for i in range ( N ) :
        num = random.randint ( 1 , 10000 )
        if num % 2 == 0 :
            gu += 1
        else :
            ki += 1
    if ki == 0 :
        print ( 1 << N if P == 0 else 0 )
    else :
        print ( 1 << N - 1 )
