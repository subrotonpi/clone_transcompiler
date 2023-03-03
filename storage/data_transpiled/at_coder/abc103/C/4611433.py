def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from time import sleep
    n = randint ( 1 , 10000 )
    ans = 0
    for i in range ( n ) :
        ans += randint ( 1 , 10000 )
    sleep ( 1 )
    ans -= n
    print ( ans )
