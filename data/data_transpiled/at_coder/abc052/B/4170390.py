def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from itertools import chain
    a = randint ( 1 , 4 )
    b = urandom ( 1 )
    ans = 0
    count = 0
    for i in range ( 0 , a ) :
        if b [ i ] == 'I' :
            count += 1
        else :
            count -= 1
        if count > ans :
            ans = count
    print ( ans )
