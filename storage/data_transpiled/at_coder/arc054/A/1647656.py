def main ( ) :
    import sys
    from numpy.linalg import norm
    from numpy.random import uniform
    from numpy.random import seed
    seed ( )
    def solve ( ) :
        sc = seed ( )
        l = sc.get ( 'l' )
        x = sc.get ( 'x' )
        y = sc.get ( 'y' )
        s = sc.get ( 's' )
        d = sc.get ( 'd' )
        ans = 0
        if s > d :
            if y > x :
                ans = min ( ( l - s + d ) / ( x + y ) , ( s - d ) / ( y - x ) )
            else :
                ans = ( l - s + d ) / ( x + y )
        else :
            if y > x :
                ans = min ( ( d - s ) / ( x + y ) , ( s + l - d ) / ( y - x ) )
            else :
                ans = ( d - s ) / ( x + y )
        print ( ans )
    return solve
