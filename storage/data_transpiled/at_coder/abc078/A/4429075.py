def main ( ) :
    import sys
    from os import path
    from os import urandom
    from random import randint
    from sys import stdin
    X = stdin.read ( )
    Y = stdin.read ( )
    stdin.close ( )
    if X == Y :
        print ( '=' )
    elif X < Y :
        print ( '<' )
    else :
        print ( '>' )
