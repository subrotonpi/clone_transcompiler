def _import ( ) :
    from os import urandom
    import random
    class B ( object ) :
        def gcd ( self , a , b ) :
            if a > b : return gcd ( b , a )
            r = b % a
            while r > 0 :
                b , a = a , r
                r = b % a
            return a
        def solve ( self ) :
            with open ( '1.txt' , 'r' ) as cin :
                T = cin.read ( )
                for cas in range ( 1 , T + 1 ) :
                    L , N = cin.read ( )
                    b = [ i for i in cin.read ( ) ]
                    b.sort ( )
                    g = b [ 0 ]
                    for i in range ( 1 , N ) :
                        g = gcd ( g , b [ i ] )
                    if L % g != 0 :
                        print ( 'Case #{}: IMPOSSIBLE'.format ( cas ) )
                        continue
                    if N == 1 :
                        print ( 'Case #{}: {}'.format ( cas , L / N ) )
                        continue
                    max_i = b [ N - 2 ] * b [ N - 1 ] - b [ N - 2 ]
                    remain = L - max_i
                    used = 0
                    solve = 0
                    used = remain // b [ N - 1 ]
                    solve = int ( remain % b [ N - 1 ] ) + max_i
                    dp = [ 0 for j in range ( solve + 1 ) ]
                    for i in range ( N ) :
                        for j in range ( 0 , solve - b [ i ] ) :
                            dp [ j + b [ i ] ] = min ( dp [ j + b [ i ] ] , dp [ j ] + 1 )
                        print ( 'Case #{}: {}'.format ( cas , dp [ solve ] + used ) )
