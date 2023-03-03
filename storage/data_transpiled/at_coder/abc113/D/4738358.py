def main ( ) :
    import sys
    from math import pow
    from random import randint
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    h = randint ( 1 , h )
    w = randint ( 1 , w )
    k1 = randint ( 1 , h )
    dp = [ [ 0 ] * ( h + 1 ) for i in range ( h + 1 ) ]
    mod = 1000000007
    dp [ 0 ] [ 0 ] = 1
    for i in range ( 1 , h + 1 ) :
        for j in range ( w - 1 , - 1 , - 1 ) :
            for k in range ( pow ( 2 , w - 1 ) ) :
                a = b = jud = 0
                count = 0
                y = k
                while y > 0 :
                    if y & 1 == 1 :
                        if jud :
                            break
                        if w - 1 - count == j :
                            a = 1
                        elif w - 1 - count == j + 1 :
                            b = 1
                        jud = 1
                    else :
                        jud = 0
                    count += 1
                    y >>= 1
                    if y <= 0 :
                        jud = 0
                if jud :
                    continue
                if j > 0 and a :
                    dp [ i ] [ j ] += dp [ i - 1 ] [ j - 1 ]
                elif j < w - 1 and b :
                    dp [ i ] [ j ] += dp [ i - 1 ] [ j + 1 ]
                else :
                    dp [ i ] [ j ] += dp [ i - 1 ] [ j ]
                dp [ i ] [ j ] %= mod
    print ( dp [ h ] [ k1 - 1 ] )
