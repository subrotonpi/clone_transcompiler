def main ( args ) :
    import sys
    from numpy import linspace
    from numpy.linalg import solve
    EPS = 1e-14
    T = len ( sys.argv )
    for ca in range ( 1 , T + 1 ) :
        n = len ( sys.argv )
        a = linspace ( ca , n )
        tot = 0
        for i in range ( n ) :
            a [ i ] = sys.argv [ i ]
            tot += a [ i ]
        ans = [ ]
        for i in range ( n ) :
            lo = 0.0
            hi = 1.0
            while hi - lo > EPS :
                mid = ( hi + lo ) / 2.0
                points = mid * tot
                give = 0
                for j in range ( n ) :
                    if j == i :
                        continue
                    give += max ( 0 , a [ i ] + points - a [ j ] )
                if give <= tot - points :
                    lo = mid
                else :
                    hi = mid
            ans.append ( lo * 100 )
        print ( 'Case #%d:' % ca , end = ' ' )
        for i in range ( n ) :
            print ( ' ' , ans [ i ] , end = ' ' )
        print ( )
