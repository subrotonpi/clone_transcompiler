def _main ( args ) :
    import sys
    from os import path
    from os import sep
    def solve ( ) :
        f = open ( "C-large.in" , "r" )
        out = open ( "C-large.out" , "w" )
        t = int ( f.readline ( ) )
        for c in range ( 1 , t + 1 ) :
            for i in range ( 1 , s ) :
                if a [ i ] :
                    print ( "%d: %d" % ( i , a [ i ] ) )
    f.close ( )
    print ( "Case #%d: %d" % ( c , cnt ) )
    for i in range ( 1 , s ) :
        if a [ i ] :
            print ( "%d: %d" % ( i , a [ i ] ) )
    f = open ( "C-large.in" , "w" )
    for i in range ( m ) :
        l = f.readline ( )
        j = 0
        for k in range ( n // 4 ) :
            v = int ( "%s" % l [ k ] , 16 )
            d = 3
            while v :
                if v & 1 == 1 :
                    g [ i ] [ j + d ] = 1
                v >>= 1
                del v
            j += 4
    for i in range ( m ) :
        for j in range ( n ) :
            if g [ i ] [ j ] != 2 :
                flag = 1
                d = 0
                if i :
                    d = g [ i - 1 ] [ j ] - 1
                elif j :
                    d = g [ i ] [ j - 1 ] - 1
                if d == 0 :
                    d = 1
                for k in range ( i + d ) :
                    for p in range ( j + k - i ) :
                        for q in range ( i , j + k ) :
                            flag = g [ q ] [ p ] != g [ q ] [ p - 1 ]
                        for q in range ( j , k ) :
                            flag = g [ k ] [ q ] != g [ k - 1 ] [ q ]
    return a