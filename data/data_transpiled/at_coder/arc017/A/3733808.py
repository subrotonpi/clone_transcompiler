def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from sys import stdin
    n = stdin.read ( )
    m , a = 0 , n
    if n > 10100 :
        a = n / 100
    for i in range ( 2 , a ) :
        if n % i == 0 :
            m += 1
    if m == 0 :
        print ( "YES" )
    else :
        print ( "NO" )
