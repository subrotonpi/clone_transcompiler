def opt ( n , m , k ) :
    if k == 1 or m == 1 or n == 1 :
        return k
    res = m * n + 1
    for a in range ( m , n ) :
        for e in range ( a + e , m ) :
            for b in range ( a + e + b , m ) :
                for g in range ( b + g + c , n ) :
                    for c in range ( b + g + c , n ) :
                        for d in range ( c + d , a + e + b + g + c ) :
                            f = a + e + b - c - d
                            h = b + g + c - a - d
                            K = ( a + e + b + 1 ) * ( b + g + c + 1 )
                            K -= a * ( a + 1 ) / 2
                            K -= b * ( b + 1 ) / 2
                            K -= c * ( c + 1 ) / 2
                            K -= d * ( d + 1 ) / 2
                            if K >= k and a + b + c + d + e + f + g + h < res :
                                res = a + b + c + d + e + f + g + h
    def main ( ) :
        cases = stdscr.getch ( )
        for i in range ( cases ) :
            print ( "Case #%d: " % ( i + 1 ) , end = ' ' )
            n = stdscr.getch ( )
            m = stdscr.getch ( )
            k = stdscr.getch ( )
            print ( opt ( n , m , k ) )
    def main1 ( ) :
        for m in range ( 1 , 6 ) :
            for n in range ( m + 1 , 6 ) :
                for k in range ( 2 , n * m + 1 ) :
                    opt ( n , m , k )
    return res
