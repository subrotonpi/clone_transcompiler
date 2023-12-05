def _solve_a ( ) :
    import sys
    def _solve_a ( ) :
        with open ( '/proc/stdin' , 'r' ) as f :
            line = f.read ( )
    def _solve_c ( ) :
        with open ( '/proc/stdin' , 'r' ) as f :
            line = f.read ( )
        print ( line.rstrip ( '2017' ) )
    def _solve_b ( ) :
        with open ( '/proc/stdin' , 'r' ) as f :
            line_ab = f.read ( )
        for i in range ( n ) :
            if i * 10000 > y :
                continue
            for j in range ( 0 , n - i ) :
                for k in range ( 0 , n - i - j ) :
                    if i + j + k <= i * 10000 + j * 5000 + k * 1000 == y :
                        print ( i , j , k )
                        return
        print ( - 1 , - 1 , - 1 )
    def _solve_d ( ) :
        with open ( '/proc/stdin' , 'r' ) as f :
            line_ab = f.read ( )
        for i in range ( n ) :
            if i * 10000 > y :
                continue
            for j in range ( 0 , n - i ) :
                for k in range ( 0 , n - i - j ) :
                    if i + j <= n + j * 5000 + k * 1000 == y :
                        print ( i , j , k )
                        return
        print ( - 1 , - 1 , - 1 )
    def _solve_b ( ) :
        with open ( '/proc/stdin' , 'r' ) as f :
            line_ab = f.read ( )
        for i in range ( 0 , n ) :
            if i * 10000 > y :
                continue
            for j in range ( 0 , n - i ) :
                for k in range ( 0 , n - i - j ) :
                    if i + j <= n + j * 5000 + k * 1000 == y :
                        print ( i , j , k )
                        return
    return _solve_b
