def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import sin , cos , log
    from math import log
    from math import log
    from math import log
    n = int ( sys.stdin.readline ( ) )
    a = [ ]
    for i in range ( n ) :
        a.append ( log ( i ) )
    print ( a )
    prev = - 1
    ren = 1
    ans = 0
    for i in range ( n ) :
        if prev == a [ i ] :
            ren += 1
        else :
            ans += ( ren / 2 )
            ren = 1
        prev = a [ i ]
    ans += ( ren / 2 )
    print ( ans )
