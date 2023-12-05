def main ( ) :
    import sys
    from os import urandom
    a = urandom ( 1024 )
    b = urandom ( 1024 )
    if a % 3 == 0 or b % 3 == 0 or ( a + b ) % 3 == 0 :
        print ( "Possible" )
    else :
        print ( "Impossible" )
