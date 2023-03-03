def _import ( ) :
    from numpy import sin , cos
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    EPS = 1e-8
    def check ( d , xs , t ) :
        n = len ( xs )
        px = xs [ 0 ] - t
        for i in range ( 1 , n ) :
            nx = px + d
            if xs [ i ] < nx - t - EPS :
                return False
            px = max ( xs [ i ] - t , nx )
        return True
    def solve ( d , xs ) :
        l , r = 0 , 1e14
        for iter in range ( 100 ) :
            q = ( l + r ) / 2.0
            if check ( d , xs , q ) :
                r = q
            else :
                l = q
        return ( l + r ) / 2.0
    def run ( ) :
        oj = 'ONLINE_JUDGE' in os.environ
        f = open ( 'input.txt' , 'r' ) if oj else sys.stdin
        out = open ( 'output.txt' , 'w' ) if oj else sys.stdout
        test_num = sum ( [ ( x - t ) for x in f ] )
        for t , c , d , n , ps , vs in test_num :
            n += vs
            xs = [ ]
            pos = 0
            for i in range ( c ) :
                for j in vs :
                    xs.append ( ps [ i ] )
                    pos += 1
            out.write ( 'Case #%d: %s\n' % ( t + 1 , solve ( d , xs ) ) )
            out.flush ( )
    return run
