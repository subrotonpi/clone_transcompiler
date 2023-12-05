def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from string import ascii_letters
    a = ascii_letters [ : : - 1 ]
    b = ascii_letters [ : : - 1 ]
    c = ascii_letters [ : : - 1 ]
    result = 'NO'
    if a [ - 1 ] == b [ 0 ] :
        if b [ - 1 ] == c [ 0 ] :
            result = 'YES'
    print ( result )
    os.urandom ( 1 )
