def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from sys import stdin
    n = randint ( 1 , 10000 )
    ans = 0
    for i in range ( n ) :
        ans += randint ( 1 , 10000 ) - 1
    print ( ans )
