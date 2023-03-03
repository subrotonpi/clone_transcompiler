def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from math import log
    from math import radians
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    n = int ( sys.stdin.read ( ) )
    a = [ ]
    for i in range ( n ) :
        a.append ( log ( i ) )
    log ( log ( n ) )
    ans = n
    cnt = 0
    for i in range ( 1 , n ) :
        if a [ i - 1 ] < a [ i ] :
            cnt += 1
        else :
            ans += cnt * ( cnt + 1 ) / 2
            cnt = 0
    ans += cnt * ( cnt + 1 ) / 2
    print ( ans )
