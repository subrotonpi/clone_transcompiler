def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import sin , cos , log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    n = int ( sys.stdin.readline ( ) )
    x = int ( sys.stdin.readline ( ) )
    pow = [ ]
    total = 0
    amari = 0
    ans = 0
    for i in range ( n ) :
        pow.append ( log ( i ) )
        total += pow [ i ]
    pow = pow [ 1 : ]
    amari = x - total
    if amari == 0 :
        ans = n
    else :
        ans = ( amari // pow [ 0 ] ) + n
    print ( ans )
