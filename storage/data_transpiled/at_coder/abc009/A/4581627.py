def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from sys import stdin
    from sys import stdout
    d = stdin.read ( )
    a = d % 2
    b = d // 2
    if a == 0 :
        print ( b )
    else :
        c = b + 1
        print ( c )
