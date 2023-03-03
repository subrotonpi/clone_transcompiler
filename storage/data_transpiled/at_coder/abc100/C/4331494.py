def main ( ) :
    import sys
    from random import randint
    from math import radians
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    n = int ( sys.stdin.readline ( ) )
    a = [ ]
    for i in range ( n ) :
        a.append ( log ( i ) )
    ans = 0
    for i in range ( n ) :
        while a [ i ] % 2 == 0 :
            a [ i ] /= 2
            ans += 1
    print ( ans )
