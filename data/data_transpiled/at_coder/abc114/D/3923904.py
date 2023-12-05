def main ( ) :
    import sys
    from math import ceil
    from math import sin , cos , log
    from math import sin , cos , log
    from math import log
    N = int ( sys.stdin.read ( ) )
    log.debug ( "N = " + str ( N ) )
    P = [ 0 ] * 48
    over74 = 0
    over24 = 0
    over14 = 0
    over4 = 0
    over2 = 0
    for i in range ( 2 , N + 1 ) :
        x = i
        for j in range ( 2 , min ( N , 48 ) ) :
            while x % j == 0 :
                x /= j
                P [ j ] += 1
    for p in P :
        if p > 1 :
            over2 += 1
        if p > 3 :
            over4 += 1
        if p > 13 :
            over14 += 1
        if p > 23 :
            over24 += 1
        if p > 73 :
            over74 += 1
    ans = 0
    ans += over74
    if over14 and over4 > 1 :
        ans += over14 * ( over4 - 1 )
    if over24 and over2 > 1 :
        ans += over24 * ( over2 - 1 )
    if over4 and over2 > 2 :
        ans += ( over4 * ( over4 - 1 ) / 2 ) * ( over2 - 2 )
    print ( ans )
