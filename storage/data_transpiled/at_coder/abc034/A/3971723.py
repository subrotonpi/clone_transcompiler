def main ( ) :
    import sys
    from os import urandom
    a = urandom ( 1024 )
    b = urandom ( 1024 )
    if a > b :
        print ( "Worse" )
    else :
        print ( "Better" )
