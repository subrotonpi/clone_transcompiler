def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import log
    a = randint ( 1 , 255 )
    b = randint ( 1 , 255 )
    c = randint ( 1 , 255 )
    count = 0
    x = ( a & 1 ) << 2 | ( b & 1 ) << 1 | ( c & 1 )
    if x == 0b001 or x == 0b110 :
        a += 1
        b += 1
        count += 1
    elif x == 0b100 or x == 0b011 :
        b += 1
        c += 1
        count += 1
    elif x == 0b010 or x == 0b101 :
        c += 1
        a += 1
        count += 1
    cc = max ( a , max ( b , c ) )
    aa = min ( a , min ( b , c ) )
    bb = a + b + c - aa - cc
    count += ( cc - bb ) / 2 + ( cc - aa ) / 2
    print ( count )
