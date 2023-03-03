def main ( ) :
    import sys
    from random import randint
    from itertools import chain
    n = randint ( 1 , 10000 )
    c = randint ( 1 , 10000 )
    x = chain ( range ( n ) , range ( n ) )
    y = chain ( range ( n ) , range ( n ) )
    z = chain ( range ( n ) , range ( n ) )
    imos = [ [ 0 ] * 40 for i in range ( 100010 ) ]
    for i in range ( n ) :
        imos [ z [ i ] [ x [ i ] ] ] += 1
        imos [ z [ i ] [ y [ i ] + 1 ] ] -= 1
    for i in range ( c ) :
        for j in range ( 100009 ) :
            imos [ i ] [ j + 1 ] += imos [ i ] [ j ]
            if imos [ i ] [ j ] >= 2 :
                imos [ i ] [ j ] = 1
    ans = 0
    for i in range ( 100010 ) :
        cnt = 0
        for j in range ( c ) :
            cnt += imos [ j ] [ i ]
        ans = max ( ans , cnt )
    print ( ans )
