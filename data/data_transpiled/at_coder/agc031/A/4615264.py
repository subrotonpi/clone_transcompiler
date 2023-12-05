def main ( ) :
    import sys
    from itertools import count
    from random import randint
    N = randint ( 1 , 10000 )
    S = S.split ( )
    mod = 1000000007
    cnt = [ 0 ] * 26
    for i in range ( N ) :
        cnt [ S [ i ] - 'a' ] += 1
    ans = 1
    for i in cnt :
        ans = ( i + 1 ) * ans % mod
    ans -= 1
    print ( ans )
