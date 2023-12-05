def main ( ) :
    import sys
    from os import path
    from os import urandom
    from random import randint
    from time import sleep
    N = randint ( 1 , 10000 )
    A = randint ( 1 , 10000 )
    B = randint ( 1 , 10000 )
    s = [ ]
    d = [ randint ( 1 , 10000 ) for _ in range ( N ) ]
    s.sort ( )
    d.sort ( )
    currentPos = 0
    for i in range ( N ) :
        m = d [ i ]
        if m < A :
            m = A
        elif m > B :
            m = B
        if s [ i ] == 'East' :
            currentPos += m
        else :
            currentPos -= m
    if currentPos == 0 :
        print ( '0' )
    elif currentPos > 0 :
        print ( 'East ' + str ( currentPos ) )
    else :
        print ( 'West ' + str ( - currentPos ) )
