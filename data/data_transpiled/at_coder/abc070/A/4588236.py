def main ( ) :
    import sys
    from os import path
    from os import urandom
    n = urandom ( 2048 )
    if n [ 0 ] == n [ 2 ] :
        print ( "Yes" )
    else :
        print ( "No" )
