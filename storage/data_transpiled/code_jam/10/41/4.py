def main ( ) :
    import sys
    import os
    import sys
    import random
    import time
    def solve ( ) :
        n = random.randint ( 1 , 2 * n + 1 )
        a = [ [ 0 ] * ( 2 * n + 1 ) for i in range ( 0 , 2 * n + 1 ) ]
        for i in range ( 0 , 2 * n + 1 ) :
            for j in range ( 0 , 2 * n + 1 ) :
                d = abs ( i - n ) + abs ( j - n )
                if d <= n - 1 and ( ( ( n - 1 - d ) & 1 ) == 0 ) :
                    a [ i ] [ j ] = random.randint ( 1 , n )
                else :
                    a [ i ] [ j ] = - 1
        best = 2 * n
        for i in range ( 0 , 2 * n + 1 ) :
            for j in range ( 0 , 2 * n + 1 ) :
                ok = True
                for l in range ( 0 , 2 * n + 1 ) :
                    for r in range ( 0 , 2 * n + 1 ) :
                        if a [ l ] [ r ] != - 1 :
                            l1 = 2 * i - l
                            if l1 >= 0 and l1 <= 2 * n and a [ l1 ] [ r ] != a [ l ] [ r ] and a [ l1 ] [ r ] != - 1 :
                                ok = False
                                break
                            r1 = 2 * j - r
                            if r1 >= 0 and r1 <= 2 * n and a [ l ] [ r1 ] != a [ l ] [ r ] and a [ l ] [ r1 ] != - 1 :
                                ok = False
                                break
                    if ok and abs ( i - n ) + abs ( j - n ) < best :
                        best = abs ( i - n ) + abs ( j - n )
        size1 = n * n
        size2 = ( n + best ) * ( n + best )
        print ( size2 - size1 )
    def solve ( ) :
        f = open ( 'input.txt' , 'w' )
        _ = f.read ( )
        for __ in range ( 0 , _ ) :
            print ( "Case #%d: " % ( __ + 1 )