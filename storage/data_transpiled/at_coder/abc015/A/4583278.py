def main ( ) :
    import sys
    from os import path
    from os import urandom
    from random import randint
    from itertools import chain
    a = chain ( [ a , b ] , repeat = 3 )
    b = chain ( [ a , b ] , repeat = 3 )
    aa = len ( a )
    bb = len ( b )
    if aa > bb :
        print ( a )
    else :
        print ( b )
