def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from string import ascii_letters
    n = urandom ( 16 )
    if '9' in n :
        print ( "Yes" )
    else :
        print ( "No" )
