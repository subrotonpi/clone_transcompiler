def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from sys import stdin
    r = stdin.read ( )
    if r < 1200 :
        print ( 'ABC' )
    elif r < 2800 :
        print ( 'ARC' )
    else :
        print ( 'AGC' )
