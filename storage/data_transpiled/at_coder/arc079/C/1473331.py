def main ( ) :
    import random
    from math import ceil
    from math import log
    from math import sin , cos , ceil , log
    from math import log
    from math import log
    from math import pi
    from math import log
    from math import log
    from math import pi
    N = int ( random.randint ( 1 , N ) )
    a = [ ]
    for i in range ( N ) :
        a.append ( pi )
    ans = 0
    a.sort ( )
    for i in range ( 1 , N ) :
        op = ( a [ i ] - a [ 0 ] ) / ( N + 1 )
        ans += op
        a [ i ] -= op * ( N + 1 )
    for i in range ( N ) :
        a [ i ] += ans
    a.sort ( )
    op = max ( 0 , a [ 0 ] - N )
    for i in range ( N ) :
        a [ i ] -= op
        ans += op * N
        idx = N - 1
        while 1 :
            if a [ idx ] <= N - 1 :
                break
            ans += 1
            a [ idx ] -= N
            for i in range ( N ) :
                if i != idx :
                    a [ i ] += 1
            idx = ( idx - 1 + N ) % N
        print ( ans )
