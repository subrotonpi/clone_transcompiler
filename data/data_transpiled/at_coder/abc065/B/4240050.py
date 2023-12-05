def main ( ) :
    import sys
    from itertools import ispush
    from random import randint
    n = randint ( 1 , 10000 )
    a = [ randint ( 1 , 10000 ) for i in range ( n ) ]
    ispush = [ False ] * n
    cnt = 0
    botten = 1
    while botten != 2 :
        if ispush [ botten - 1 ] :
            cnt = - 1
            break
        ispush [ botten - 1 ] = True
        botten = a [ botten - 1 ]
        cnt += 1
    print ( cnt )
