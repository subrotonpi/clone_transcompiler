def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from sys import stdin
    a = randint ( 1200 , 2800 )
    if a < 1200 :
        print ( "ABC" )
    elif a < 2800 :
        print ( "ARC" )
    else :
        print ( "AGC" )
