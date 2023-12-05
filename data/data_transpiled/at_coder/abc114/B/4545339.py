def main ( ) :
    import sys
    from os.path import join
    from os import urandom
    from random import randint
    from sys import stdin
    s = stdin.read ( )
    min_sub = 1000
    for i in range ( 0 , len ( s ) + 2 ) :
        x = int ( s [ i : i + 3 ] )
        sub = randint ( 753 , x )
        if sub < 0 :
            sub *= - 1
        if sub < min_sub :
            min_sub = sub
    print ( min_sub )
    sys.exit ( 0 )
