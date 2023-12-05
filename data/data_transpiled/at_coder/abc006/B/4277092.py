def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from sys import stdin
    n = randint ( 1 , 10000 )
    a = [ ]
    if n == 1 or n == 2 :
        print ( 0 )
        return
    elif n == 3 :
        print ( 1 )
        return
    a.append ( 0 )
    a.append ( 0 )
    a.append ( 1 )
    for i in range ( 3 , n ) :
        a [ i ] = a [ i - 1 ] + a [ i - 2 ] + a [ i - 3 ]
        a [ i ] %= 10007
    print ( a [ n - 1 ] )
