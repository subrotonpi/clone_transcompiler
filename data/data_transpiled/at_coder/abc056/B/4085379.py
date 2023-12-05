def main ( ) :
    import sys
    from math import sin , cos
    from os import urandom
    from os import urandom
    w = urandom ( 1 )
    a = urandom ( 1 )
    b = urandom ( 1 )
    if a + w >= b and a <= b + w :
        print ( 0 )
    elif a + w < b :
        print ( abs ( a + w - b ) )
    else :
        print ( abs ( b + w - a ) )
