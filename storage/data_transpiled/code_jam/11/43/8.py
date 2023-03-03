def main ( ) :
    import sys
    import random
    MAXN = 10000000
    isp = [ True ] * MAXN
    P = [ ]
    for i in range ( 2 , MAXN ) :
        if isp [ i ] :
            P.append ( long ( i ) )
            for j in range ( 2 * i , MAXN , i ) :
                isp [ j ] = False
    with open ( '/proc/' , 'r' ) as infile :
        T = infile.read ( )
        for zz in range ( 1 , T + 1 ) :
            N = infile.read ( )
            if N == 1 :
                ans = 0
            else :
                ans = 1
            for p in P :
                q = p
                count = 0
                while q * p <= N :
                    q *= p
                    count += 1
                if count == 0 :
                    break
                ans += count
            print ( 'Case #%d: %d\n' % ( zz , ans ) )
