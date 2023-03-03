def main ( ) :
    from math import ceil
    from os import urandom
    from random import randint
    from time import sleep
    n = randint ( 1 , 1000000007 )
    dp = [ [ 0 ] * ( n + 1 ) for n in range ( 4 ) ]
    dp [ 0 ] [ 3 ] [ 3 ] [ 3 ] = 1
    for i in range ( 1 , n + 1 ) :
        for j in range ( 4 ) :
            for k in range ( 4 ) :
                for l in range ( 4 ) :
                    if dp [ i - 1 ] [ j ] [ k ] [ l ] == 0 :
                        continue
                    for u in range ( 4 ) :
                        if u == 2 and k == 0 and l == 1 :
                            continue
                        elif u == 2 and k == 1 and l == 0 :
                            continue
                        elif u == 1 and l == 2 and k == 0 :
                            continue
                        elif u == 2 and j == 0 and k == 1 :
                            continue
                        elif u == 2 and l == 1 and j == 0 :
                            continue
                        dp [ i ] [ k ] [ l ] += dp [ i - 1 ] [ j ] [ k ] [ l ]
                        dp [ i ] [ k ] [ l ] [ u ] %= mod
    ans = 0
    for i in range ( 4 ) :
        for j in range ( 4 ) :
            for k in range ( 4 ) :
                ans += dp [ n ] [ i ] [ j ] [ k ]
                ans %= mod
    print ( ans )
