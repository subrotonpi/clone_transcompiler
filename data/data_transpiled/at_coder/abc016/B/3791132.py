def main ( ) :
    import sys
    from os import urandom
    a = urandom ( 256 )
    b = urandom ( 256 )
    c = urandom ( 256 )
    if a + b == c and a - b == c :
        print ( "?" )
    elif a + b == c :
        print ( "+" )
    elif a + b != c and a - b != c :
        print ( "!" )
    else :
        print ( "-" )
