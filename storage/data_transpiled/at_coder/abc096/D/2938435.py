def main ( ) :
    import sys
    from random import randint
    from sys import stdin
    N = randint ( 1 , 10000 )
    ans = [ 2 ] * N
    ansptr = 1
    prime = [ 2 ] * 1000
    ptr = 1
    num = 3
    while ansptr < N :
        is_prime = True
        for i in range ( 1 , ptr ) :
            if num % prime [ i ] == 0 :
                is_prime = False
                break
        if is_prime :
            prime [ ptr ] = num
            if num % 5 == 1 :
                ans [ ansptr ] = num
        num += 2
    for i in range ( N ) :
        print ( ans [ i ] , end = ' ' )
