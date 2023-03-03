def main ( ) :
    import sys
    from random import randint
    from itertools import chain
    from itertools import chain
    N , M , D = map ( int , repeat ( range ( M ) ) )
    A = chain ( range ( M ) )
    amida = chain ( range ( N ) )
    for i in range ( M ) :
        tmp = amida [ A [ i ] ]
        amida [ A [ i ] ] = amida [ A [ i ] + 1 ]
        amida [ A [ i ] + 1 ] = tmp
    doubling = chain ( range ( 31 ) , range ( N ) )
    for i in range ( N ) :
        doubling [ 0 ] [ amida [ i ] ] = i
    for i in range ( 30 ) :
        for j in range ( N ) :
            doubling [ i + 1 ] [ j ] = doubling [ i ] [ doubling [ i ] [ j ] ]
    for i in range ( N ) :
        now , res = i , D
        for j in range ( 30 , - 1 , - 1 ) :
            if ( res >> j & 1 ) == 1 :
                now , res -= 1 << j
        print ( now + 1 )
