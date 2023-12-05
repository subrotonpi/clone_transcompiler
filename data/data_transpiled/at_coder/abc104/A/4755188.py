def main ( ) :
    import sys
    from os import path
    from os import urandom
    sc = urandom ( 2 )
    a = int ( sc )
    if a < 1200 :
        print ( "ABC" )
    elif a < 2800 :
        print ( "ARC" )
    else :
        print ( "AGC" )
