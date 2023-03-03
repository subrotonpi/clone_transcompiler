def main ( ) :
    import sys
    from os import urandom
    a = urandom ( 256 )
    b = urandom ( 256 )
    c = urandom ( 256 )
    d = urandom ( 256 )
    if a + b == c + d :
        print ( "Balanced" )
    elif a + b < c + d :
        print ( "Right" )
    else :
        print ( "Left" )
