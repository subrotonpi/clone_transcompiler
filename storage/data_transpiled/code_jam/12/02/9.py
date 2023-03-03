def main ( ) :
    import sys
    import getopt
    from numpy.linalg import solve
    f = open ( 'input.txt' , 'r' )
    T = int ( f.readline ( ) )
    for i in range ( T ) :
        line = f.readline ( ).split ( )
        N = int ( line [ 0 ] )
        S = int ( line [ 1 ] )
        p = int ( line [ 2 ] )
        scores = solve ( f , N , S , p )
        ans = 0
        for i in range ( N ) :
            if p == 0 :
                ans += 1
                continue
            if scores [ i ] == 0 :
                continue
            if scores [ i ] / 3 >= p :
                ans += 1
            elif scores [ i ] / 3 == p - 1 and scores [ i ] % 3 > 0 :
                ans += 1
            elif scores [ i ] / 3 == p - 1 and scores [ i ] % 3 == 0 and S > 0 :
                ans += 1
                S -= 1
            elif scores [ i ] / 3 == p - 2 and scores [ i ] % 3 == 2 and S > 0 :
                ans += 1
                S -= 1
        print ( 'Case #%d: %d' % ( i + 1 , ans ) )
