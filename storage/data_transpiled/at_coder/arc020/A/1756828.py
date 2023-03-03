def main ( args ) :
    import sys
    from math import sin , cos
    from os import urandom
    a = abs ( urandom ( 1 ) )
    b = abs ( urandom ( 2 ) )
    if a < b :
        print ( "Ant" )
    elif a == b :
        print ( "Draw" )
    else :
        print ( "Bug" )
