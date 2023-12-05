def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from itertools import chain
    a = chain ( [ a , b , c ] , repeat = 3 )
    b = chain ( [ a , b , c ] , repeat = 3 )
    c = chain ( [ a , b , c ] , repeat = 3 )
    if a [ - 1 ] == b [ 0 ] and ( b [ - 1 ] == c [ 0 ] ) :
        print ( 'YES' )
    else :
        print ( 'NO' )
