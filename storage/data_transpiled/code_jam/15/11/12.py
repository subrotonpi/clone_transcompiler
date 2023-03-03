def _import ( ) :
    import sys
    from numpy.testing import assert_almost_equal
    with open ( 'A-large.in' , 'r' ) as infile , open ( 'A-large.out' , 'w' ) as outfile :
        t = sys.argv [ 1 ]
        for x in range ( t ) :
            n = sys.argv [ 1 ]
            x = np.arange ( n )
            rate = 0
            for y in range ( n ) :
                x [ y ] = sys.argv [ 1 ]
                if y > 0 :
                    rate = max ( rate , x [ y - 1 ] - x [ y ] )
            result1 = 0
            result2 = 0
            for z in range ( len ( x ) - 1 ) :
                result1 += max ( 0 , x [ z ] - x [ z + 1 ] )
                result2 += min ( rate , x [ z ] )
            print ( 'Case #%d: %f %f' % ( x + 1 , result1 , result2 ) , file = outfile )
