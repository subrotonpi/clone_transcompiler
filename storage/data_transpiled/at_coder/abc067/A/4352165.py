def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from sys import stdin
    from os.path import expanduser
    from os.path import join
    from os.path import expanduser
    from os.path import join
    from os.path import join
    A = randint ( 1 , 4 )
    B = randint ( 1 , 4 )
    if A % 3 == 0 or B % 3 == 0 or ( A + B ) % 3 == 0 :
        print ( "Possible" )
    else :
        print ( "Impossible" )
