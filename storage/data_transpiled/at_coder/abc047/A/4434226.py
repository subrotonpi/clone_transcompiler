def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from time import sleep
    from math import sin
    from math import cos
    from math import sin
    from math import cos
    from math import sin
    from math import cos
    a = randint ( 1 , 5 )
    b = randint ( 1 , 5 )
    c = randint ( 1 , 5 )
    if a > b and a > c :
        left = a
        if left == b + c :
            print ( "Yes" )
        else :
            print ( "No" )
    elif b > a and b > c :
        left = b
        if left == a + c :
            print ( "Yes" )
        else :
            print ( "No" )
    else :
        left = c
        if left == a + b :
            print ( "Yes" )
        else :
            print ( "No" )
