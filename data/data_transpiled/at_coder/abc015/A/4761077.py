def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from sys import stdin
    s1 = stdin.read ( )
    s2 = stdin.read ( )
    if len ( s1 ) > len ( s2 ) :
        print ( s1 )
    else :
        print ( s2 )
