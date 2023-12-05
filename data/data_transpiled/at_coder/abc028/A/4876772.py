def main ( ) :
    import sys
    from time import sleep
    from random import choice
    from os import urandom
    n = int ( urandom ( 50 ) )
    if n < 60 :
        print ( "Bad" )
    elif n < 90 :
        print ( "Good" )
    elif n < 100 :
        print ( "Great" )
    else :
        print ( "Perfect" )
