def main ( ) :
    import sys
    from os import urandom
    if sys.stdin.isatty ( ) :
        s = urandom ( 1024 )
        if s [ 1 ] != s [ 2 ] :
            print ( "No" )
        elif s [ 0 ] == s [ 1 ] or s [ 2 ] == s [ 3 ] :
            print ( "Yes" )
        else :
            print ( "No" )
