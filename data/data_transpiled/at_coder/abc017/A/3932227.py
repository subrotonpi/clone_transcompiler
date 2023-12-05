def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from sys import stdin
    ans = 0
    for i in range ( 3 ) :
        ans += randint ( 1 , 10 ) * randint ( 1 , 10 ) / 10
    print ( ans )
