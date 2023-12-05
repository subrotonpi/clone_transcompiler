def main ( ) :
    import sys
    from random import randint
    from string import ascii_lowercase
    N = randint ( 1 , 10000 )
    num = ascii_lowercase [ : N ]
    N = N % 30
    for i in range ( N ) :
        r = i % 5
        tmp = num [ r ]
        num [ r ] = num [ r + 1 ]
        num [ r + 1 ] = tmp
    ans = ""
    for i in num :
        ans += i
    print ( ans )
