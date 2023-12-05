def main ( ) :
    import sys
    from time import sleep
    from random import randint
    a = randint ( 1 , 10000 )
    b = randint ( 1 , 10000 )
    c = randint ( 1 , 10000 )
    count = 0
    while count < 100 :
        d = a
        e = b
        f = c
        if a % 2 == 0 and b % 2 == 0 and c % 2 == 0 :
            count += 1
            a = ( e + f ) / 2
            b = ( f + d ) / 2
            c = ( d + e ) / 2
            d = a
            e = b
            c = f
        else :
            break
    if count < 100 :
        print ( count )
    else :
        sys.stdout.write ( - 1 )
