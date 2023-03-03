def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from sys import stdout
    a = urandom ( 16 )
    b = urandom ( 16 )
    for i in range ( len ( a ) ) :
        print ( a [ i ] , end = ' ' )
        try :
            print ( b [ i ] , end = ' ' )
        except Exception :
            pass
    print ( )
