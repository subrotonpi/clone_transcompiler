def main ( ) :
    import sys
    class b ( object ) :
        def __init__ ( self ) :
            self.input = sys.stdin
    T = len ( sys.argv )
    for t in range ( 1 , T + 1 ) :
        print ( "Case #%d: " % t , end = ' ' )
        r , c , n = [ int ( i ) for i in range ( r ) ]
        grid = [ False ] * ( r - 1 )
        poss = [ ]
        for i in range ( r ) :
            for j in range ( c ) :
                if ( i + j ) % 2 == 0 :
                    poss.append ( 0 )
                    grid [ i ] [ j ] = True
        for i in range ( r ) :
            for j in range ( c ) :
                if grid [ i ] [ j ] :
                    continue
                count = 0
                if i > 0 :
                    count += 1
                if j > 0 :
                    count += 1
                if i < r - 1 :
                    count += 1
                if j < c - 1 :
                    count += 1
                poss.append ( count )
        poss.sort ( )
        res1 = 0
        for i in range ( n ) :
            res1 += poss [ i ]
        grid = [ False ] * ( r - 1 )
        poss = [ ]
        for i in range ( r ) :
            for j in range ( c ) :
                if ( i + j ) % 2 == 1 :
                    poss.append ( 0 )
                    grid [ i ] [ j ] = True
        for i in range ( r ) :
            res2 += poss [ i ]
        print ( min ( res1 , res2 ) )
