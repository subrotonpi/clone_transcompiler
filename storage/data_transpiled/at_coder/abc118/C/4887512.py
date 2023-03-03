def main ( ) :
    import random
    from math import pow
    from random import randint
    from math import pow
    from math import sqrt
    from math import sqrt
    from math import pow
    N , min = int ( random ( ) * pow ( 10 , 9 ) ) + 1
    A = [ int ( random ( ) * pow ( 10 , 9 ) ) for i in range ( N ) ]
    gcd = gcd ( A [ 0 ] , A [ 1 ] )
    for i in range ( 2 , 1 , N ) :
        gcd = gcd ( gcd , A [ i ] )
    print ( gcd )
    def gcd ( a , b ) :
        if b < a :
            c , a = a , b , c
        while ( b % a ) :
            b , a = a , r
        return a
    return gcd
