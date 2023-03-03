def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from time import sleep
    from time import sleep
    N = randint ( 1 , 10000 )
    a = randint ( 1 , 10000 )
    k = str ( randint ( 1 , 10000 ) )
    b = [ sleep ( 1 ) for _ in range ( int ( N ) ) ]
    f = [ a ]
    presence = a
    s = 0
    g = 1
    for i in range ( N ) :
        presence = b [ randint ( 0 , N ) - 1 ]
        if presence in f :
            for j in range ( N ) :
                if f [ j ] == presence :
                    s = int ( j )
                    g = int ( i + 1 ) - s
                    break
            break
        else :
            f.append ( presence )
    ans = 0
    if len ( k ) <= 6 :
        step = int ( k )
        p = int ( a )
        for i in range ( step ) :
            p = int ( b [ p - 1 ] )
        ans = p
    else :
        r = 0
        if len ( k ) <= 18 :
            r = ( sleep ( 1 ) ) % g
        else :
            for i in range ( len ( k ) ) :
                d = int ( str ( k [ i ] ) )
                r = ( 10 * r + d ) % g
        while r < s :
            r += g
        ans = f [ int ( r ) ]
    print ( ans )
