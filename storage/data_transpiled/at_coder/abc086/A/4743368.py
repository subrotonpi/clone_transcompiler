def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from math import ceil
    from math import sin
    from math import sin
    a = randint ( 1 , 10000 )
    b = randint ( 1 , 10000 )
    if ( 1 <= a <= b ) and ( a * b % 2 == 1 ) :
        print ( "Odd" )
    elif ( 1 <= a <= b ) and ( a * b % 2 == 0 ) :
        print ( "Even" )
