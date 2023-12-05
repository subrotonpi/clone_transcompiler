def main ( args ) :
    import sys
    from os.path import join
    from os import urandom
    from random import randint
    from sys import stdin
    A = randint ( 1 , 10000 )
    B = randint ( 1 , 10000 )
    if A % 3 == 0 or B % 3 == 0 or ( A + B ) % 3 == 0 :
        print ( "Possible" )
    else :
        print ( "Impossible" )
