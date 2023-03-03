def main ( ) :
    import sys
    from os import urandom
    a , b , c = getrandbits ( 1 )
    if a + b >= c :
        print ( "Yes" )
    else :
        print ( "No" )
