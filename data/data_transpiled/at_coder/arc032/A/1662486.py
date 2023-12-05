def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from os import urandom
    N = randint ( 1 , 10000 )
    ret = 0
    for i in range ( 1 , N + 1 ) :
        ret += i
    pn = [ 1 for i in range ( ret + 1 ) ]
    k = 2
    while k * k <= ret :
        if pn [ k ] == 1 :
            for i in range ( k , ret // k + 1 ) :
                pn [ i * k ] = 0
        k += 1
    if pn [ ret ] == 1 :
        print ( "WANWAN" )
    else :
        print ( "BOWWOW" )
