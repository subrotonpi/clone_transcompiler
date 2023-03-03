def main ( args ) :
    import sys
    from random import randint
    from math import sin
    from math import cos
    from math import sin
    from math import cos
    n = randint ( 1 , 5 )
    x = sin ( x )
    a = [ sin ( x ) for x in range ( n ) ]
    a.sort ( )
    ans = 0
    for i in range ( n ) :
        if i + 1 == n and x == a [ i ] :
            ans += 1
        elif i + 1 != n and x >= a [ i ] :
            ans += 1
            x -= a [ i ]
        else :
            break
    print ( ans )
