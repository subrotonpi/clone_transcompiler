def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from math import log
    from math import radians
    from math import log
    from math import log
    n = int ( sys.stdin.readline ( ) )
    a = [ 0 for _ in range ( 1000000 ) ]
    a.append ( 0 )
    a.append ( 0 )
    a.append ( 1 )
    for i in range ( 3 , len ( a ) ) :
        num = a [ i - 3 ] + a [ i - 2 ] + a [ i - 1 ]
        a [ i ] = num % 10007
    print ( a [ n - 1 ] )
