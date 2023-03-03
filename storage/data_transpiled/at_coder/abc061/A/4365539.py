def main ( ) :
    import sys
    from random import randint
    from sys import stdout
    from os import chdir
    from os import environ
    a = randint ( 1 , 10000 )
    b = randint ( 1 , 10000 )
    c = randint ( 1 , 10000 )
    ans = ( 'Yes' if a <= c <= b ) and 'No' or 'No'
    print ( ans )
