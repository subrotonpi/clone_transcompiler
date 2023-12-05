def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from time import sleep
    from sys import stdin
    a = int ( stdin.read ( ) )
    b = int ( stdin.read ( ) )
    for _ in range ( a ) :
        a -= 500
        if a < 500 :
            break
    if a <= b :
        print ( "Yes" )
    else :
        print ( "No" )
