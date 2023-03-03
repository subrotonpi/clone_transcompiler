def main ( ) :
    import sys
    from os import urandom
    a , b , c = urandom ( 2 ) , urandom ( 2 )
    if a * b % 2 == 0 :
        print ( "No" )
    else :
        print ( "Yes" )
