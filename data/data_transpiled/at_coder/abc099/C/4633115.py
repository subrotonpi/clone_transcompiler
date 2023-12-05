def main ( ) :
    import sys
    from math import pow
    from random import randint
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    n = int ( sys.stdin.read ( ) )
    log.debug ( "n = " + str ( n ) )
    ans = int ( 0 )
    for i in range ( 0 , n ) :
        cnt = 0
        n6 = i
        n9 = n - i
        for a in range ( 6 , - 1 , - 1 ) :
            mod = int ( pow ( 6 , a ) )
            cnt += n6 / mod
            n6 %= mod
        for a in range ( 5 , - 1 , - 1 ) :
            mod = int ( pow ( 9 , a ) )
            cnt += n9 / mod
            n9 %= mod
        ans = min ( ans , cnt )
    print ( ans )
