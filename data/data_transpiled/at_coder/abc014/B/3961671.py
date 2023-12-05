def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , pi
    from math import log
    from math import pi
    from math import sin , cos , pi
    n = randint ( 1 , 5 )
    x = pi
    a = [ sin ( x ) for x in range ( n ) ]
    b = [ x % 2 for x in range ( n ) ]
    ans = 0
    for i in range ( n ) :
        ans += a [ i ] * b [ i ]
    print ( ans )
