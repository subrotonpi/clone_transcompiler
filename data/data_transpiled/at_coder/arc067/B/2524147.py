def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    from math import log
    from math import sin , cos , log
    n = randint ( 1 , 5 )
    a = sin ( a )
    b = sin ( b )
    x = [ sin ( a ) for i in range ( n ) ]
    ans = 0
    for i in range ( n - 1 ) :
        cost = min ( ( x [ i + 1 ] - x [ i ] ) * sin ( a ) , cos ( b ) )
        ans += cost
    print ( ans )
