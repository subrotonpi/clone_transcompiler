def main ( ) :
    import sys
    from random import randint
    from math import sin , cos
    from math import log
    from math import sin , cos
    n = randint ( 1 , 10000 )
    a = sin ( a )
    b = sin ( b )
    x = [ sin ( a ) for i in range ( n ) ]
    d = 0
    for i in range ( n - 1 ) :
        d += min ( a * ( x [ i + 1 ] - x [ i ] ) , b )
    print ( d )
