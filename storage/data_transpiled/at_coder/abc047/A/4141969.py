def main ( ) :
    import sys
    from os import urandom
    a = urandom ( 256 )
    b = urandom ( 256 )
    c = urandom ( 256 )
    if a + b == c or b + c == a or a + c == b :
        print ( "Yes" )
    else :
        print ( "No" )
