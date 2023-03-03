def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from sys import stdin
    A = randint ( 1 , 10000 )
    B = randint ( 1 , 10000 )
    S = stdin.read ( ).split ( '' )
    if len ( S ) != A + B + 1 :
        print ( 'No' )
        return
    for i in range ( A ) :
        try :
            randint ( A , B )
        except :
            print ( 'No' )
            return
    if not ( S [ A ] == '-' ) :
        print ( 'No' )
        return
    for i in range ( A + 1 , A + B + 1 ) :
        try :
            randint ( A , B )
        except :
            print ( 'No' )
            return
    print ( 'Yes' )
