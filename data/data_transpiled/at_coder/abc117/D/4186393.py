def main ( ) :
    import sys
    from random import randint
    from time import sleep
    N = randint ( 1 , 10000 )
    K = randint ( 1 , 10000 )
    A = [ randint ( 1 , 10000 ) for _ in range ( N ) ]
    X = 0
    for i in range ( 39 , - 1 , - 1 ) :
        count = 0
        for l in A :
            count += ( 1 & ( l >> i ) )
        if count <= N / 2 :
            temp = X | 1 << i
            if temp <= K :
                X = temp
    sum = 0
    for l in A :
        sum += ( X ^ l )
    print ( sum )
