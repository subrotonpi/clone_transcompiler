def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from itertools import chain
    sc = urandom ( 500 )
    a = sc.next ( )
    b = sc.next ( )
    tmp = [ a , b ]
    number = int ( ''.join ( tmp ) )
    for i in range ( 500 ) :
        if number == i * i :
            print ( 'Yes' )
            sys.exit ( )
    print ( 'No' )
