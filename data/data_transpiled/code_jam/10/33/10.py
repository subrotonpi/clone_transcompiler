def QualC2010 ( ) :
    import csv
    from os.path import join
    from os import sep
    from os import sep
    from os import sep
    from os import sep
    from os import sep
    from os import sep
    from os import sep
    from os import sep
    from os import sep
    from os import sep
    from os import sep
    from os import sep
    from os import sep
    B = csv.reader ( open ( 'C-large.in' , 'r' ) )
    A = csv.writer ( open ( 'C-large.out' , 'w' ) )
    N , M , n , x , y , i , j , k , count = 0 , [ ] , [ ] , [ ] , [ ]
    s , S = "0123456789ABCDEF" , sep
    board = [ [ ] for _ in sep ] , [ ]
    t = int ( B.readline ( ) )
    for T in range ( t ) :
        count = 0
        s = sep.join ( s )
        M = int ( s [ 0 ] )
        N = int ( s [ 1 ] )
        total = [ 0 ] * 513
        for i in range ( M ) :
            S = B.readline ( )
            for j in range ( N // 4 ) :
                n = s.find ( S [ j ] )
                for x in range ( 4 ) :
                    board [ i ] [ 4 * j + x ] = ( n >> ( 3 - x ) ) % 2
        for n in range ( min ( M , N ) , 0 , - 1 ) :
            for i in range ( 0 , M - n ) :
                row = 0
                for j in range ( 0 , N - n ) :
                    k = board [ i ] [ j ]
                    for x in range ( n ) :
                        for y in range ( n ) :
                            if board [ x + i ] [ y + j ] < 0 or ( board [ i ] [ j ] + x + y ) % 2 != ( board [ x + i ] [ y + j ] ) % 2 :
                                continue row
                    total [ n ] += 1
                    for x in range ( n ) :
                        for y in range ( n ) :
                            board [ x + i ] [ y + j ] = - 1
            