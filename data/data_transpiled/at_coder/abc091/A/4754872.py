def main ( ) :
    import sys
    from os import path
    from os import urandom
    from random import randint
    from sys import stdin
    a = int ( stdin.read ( ) )
    b = int ( stdin.read ( ) )
    c = int ( stdin.read ( ) )
    if a + b >= c :
        print ( "Yes" )
    else :
        print ( "No" )
