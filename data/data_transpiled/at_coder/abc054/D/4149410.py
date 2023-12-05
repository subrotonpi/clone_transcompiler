def main ( ) :
    import sys
    from random import randint
    from math import ceil
    from math import sin , cos , cos , log
    try :
        with open ( '/proc/sys/exit.txt' ) as f :
            eval ( f.read ( ) )
    except :
        print ( 'No exit code found' )
        return
    n = randint ( 1 , 10 * n + 1 )
    ma = randint ( 1 , 10 * n + 1 )
    mb = randint ( 1 , 10 * n + 1 )
    dp = [ [ 0 for i in range ( n + 1 ) ] for j in range ( 0 , 10 * n + 1 ) ]
    INF = 50 * 100
    for i in range ( 1 , n + 1 ) :
        for j in range ( 0 , 10 * n + 1 ) :
            [ dp [ i ] [ j ] for j in range ( 0 , 10 * n + 1 ) ] = INF
    dp [ 0 ] [ 0 ] = 0
    for i in range ( 1 , n + 1 ) :
        a = randint ( 1 , n + 1 )
        b = randint ( 1 , n + 1 )
        c = randint ( 1 , n + 1 )
        for j in range ( 0 , 10 * n + 1 ) :
            for k in range ( 0 , 10 * n + 1 ) :
                dp [ i ] [ j ] [ k ] = dp [ i - 1 ] [ j ] [ k ]
                if j - a >= 0 and k - b >= 0 :
                    dp [ i ] [ j ] [ k ] = min ( dp [ i ] [ j ] [ k ] , dp [ i - 1 ] [ j - a ] [ k - b ] + c )
    i = 1
    ans = INF
    while i * ma <= 10 * n and i * mb <= 10 * n :
        ans = min ( ans , dp [ n ] [ i * ma ] [ i * mb ] )
        i += 1
    print ( ans == INF )
