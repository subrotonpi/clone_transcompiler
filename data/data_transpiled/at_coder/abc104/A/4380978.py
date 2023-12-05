def main ( ) :
    import sys
    from os import path
    from os import urandom
    from random import randint
    from time import sleep
    from os.path import join
    from os import path
    R = int ( urandom ( ) )
    if R < 1200 :
        print ( "ABC" )
    elif R < 2800 :
        print ( "ARC" )
    else :
        print ( "AGC" )
