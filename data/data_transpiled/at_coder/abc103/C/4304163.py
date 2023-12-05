def main ( ) :
    import sys
    from time import sleep
    from itertools import chain
    n = int ( sys.stdin.readline ( ) )
    a = chain ( [ 1 ] , repeat ( n ) )
    ans = 0
    for i in chain ( a , repeat ( n ) ) :
        ans += a [ i ] - 1
    print ( ans )
