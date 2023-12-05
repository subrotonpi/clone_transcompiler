def main ( ) :
    import sys
    from itertools import islice
    from itertools import islice
    from random import randint
    from random import choice
    from random import choice
    n = choice ( range ( 10 ) )
    a = [ choice ( range ( n ) ) for i in range ( n ) ]
    max = - 50000
    for i in range ( n ) :
        maxtaka = - 50000
        maxaoki = - 50000
        for j in islice ( a , n ) :
            taka = 0
            aoki = 0
            if i == j :
                continue
            elif i < j :
                for k in range ( i , j + 1 ) :
                    if ( k - i + 1 ) % 2 == 0 :
                        aoki += a [ k ]
                    else :
                        taka += a [ k ]
            elif i > j :
                for k in range ( j , i + 1 ) :
                    if ( k - j + 1 ) % 2 == 0 :
                        aoki += a [ k ]
                    else :
                        taka += a [ k ]
            if aoki > maxaoki :
                maxtaka , maxaoki = taka , aoki
        max = max ( max , maxtaka )
    print ( max )
