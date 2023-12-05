def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from itertools import chain
    sc = urandom ( 16 )
    a = sc.next ( )
    al = ( randint ( 1 , 4 ) , randint ( 1 , 4 ) , randint ( 1 , 4 ) )
    for i in range ( 0 , 4 ) :
        if a == al [ i ] :
            print ( i + 1 )
