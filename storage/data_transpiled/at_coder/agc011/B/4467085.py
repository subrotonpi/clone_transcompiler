def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import sin
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    n = randint ( 1 , 10000 )
    a1 = [ ]
    for i in range ( n ) :
        a = log ( i )
        a1.append ( a )
    a1.sort ( )
    ans = 1
    for i in range ( n - 1 ) :
        if a1 [ i ] * 2 >= a1 [ i + 1 ] :
            ans += 1
        else :
            ans = 1
        a1 [ i + 1 ] += a1 [ i ]
    print ( ans )
