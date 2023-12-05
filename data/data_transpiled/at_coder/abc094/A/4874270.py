def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from sys import stdin
    a , b , c = randint ( 1 , 10000 ) , randint ( 1 , 10000 ) , randint ( 1 , 10000 )
    if a <= c and a + b >= c :
        sys.stdout.write ( "YES\n" )
    else :
        sys.stdout.write ( "NO\n" )
