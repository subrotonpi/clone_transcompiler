def main ( ) :
    import sys
    import os
    from math import sin , cos , tan
    A , C , G , T , mod = 0 , 1 , 2 , 3 , 1000000007
    f = sys.stdout
    f.seek ( 0 )
    n = int ( f.read ( ) )
    dp = [ [ 0 for i in range ( 111 ) ] for j in range ( 4 ) ]
    ans = 0
    dp [ 0 ] [ 0 ] [ 0 ] = 1
    for i in range ( 1 , n + 1 ) :
        for j in range ( 4 ) :
            for k in range ( 4 ) :
                for l in range ( 4 ) :
                    for m in range ( 4 ) :
                        if i > 2 :
                            if k == A and l == G and m == C :
                                continue
                            if k == A and l == C and m == G :
                                continue
                            if k == G and l == A and m == C :
                                continue
                        if i > 3 :
                            if j == A and l == G and m == C :
                                continue
                            if j == A and k == G and m == C :
                                continue
                        dp [ i ] [ k ] [ l ] [ m ] += dp [ i - 1 ] [ j ] [ k ] [ l ]
                        dp [ i ] [ k ] [ l ] [ m ] %= mod
    for i in range ( 4 ) :
        for j in range ( 4 ) :
            for k in range ( 4 ) :
                ans += dp [ n ] [ i ] [ j ] [ k ]
                ans %= mod
    f.write ( ans )
    f.flush ( )
