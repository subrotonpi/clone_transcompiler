def main ( args ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    from os.path import join
    from os import urandom
    from os.path import join
    from os import urandom
    from random import randint
    from math import sin , cos , log
    from os.path import join
    from os import path
    N = randint ( 1 , N + 1 )
    Ma = randint ( 1 , N + 1 )
    Mb = randint ( 1 , N + 1 )
    a = [ ]
    b = [ ]
    c = [ ]
    for i in range ( 1 , N + 1 ) :
        a.append ( randint ( 1 , N + 1 ) )
        b.append ( randint ( 1 , N + 1 ) )
        c.append ( randint ( 1 , N + 1 ) )
    cost = [ [ 0 for i in range ( 1 , 500 ) ] for j in range ( 500 ) for k in range ( 500 ) ]
    cost [ 0 ] [ 0 ] = 0
    for i in range ( 1 , N + 1 ) :
        for j in range ( 500 ) :
            for k in range ( 500 ) :
                if j >= a [ i ] and k >= b [ i ] :
                    cost [ i ] [ j ] [ k ] = min ( cost [ i - 1 ] [ j ] [ k ] , cost [ i - 1 ] [ j - a [ i ] ] [ k - b [ i ] ] + c [ i ] )
                else :
                    cost [ i ] [ j ] [ k ] = cost [ i - 1 ] [ j ] [ k ]
    ans = 5000
    for i in range ( 1 , 500 ) :
        if i * Ma < 500 and i * Mb < 500 :
            ans = min ( ans , cost [ N ] [ i * Ma ] [ i * Mb ] )
    if ans == 5000 :
        ans = - 1
    print ( ans )
