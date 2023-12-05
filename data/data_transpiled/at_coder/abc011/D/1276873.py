def main ( ) :
    import math
    import numpy
    from numpy.linalg import solve
    from numpy.random import seed
    seed ( )
    N = random.randint ( 1 , 5 )
    D = random.randint ( 1 , 5 )
    X = random.randint ( 1 , 5 )
    Y = random.randint ( 1 , 5 )
    ans = 0
    if X % D == 0 and Y % D == 0 :
        x = abs ( X / D )
        y = abs ( Y / D )
        if ( N - x - y ) % 2 == 0 and x + y <= N :
            K = ( N - x - y ) / 2
            M = [ ]
            for a in range ( 0 , K ) :
                M.append ( x + a )
                M.append ( a )
                M.append ( y + K - a )
                M.append ( K - a )
                s = 1
                for i in range ( N ) :
                    M.sort ( )
                    s *= ( N - i ) / ( 4 * M [ 3 ] )
                    M [ 3 ] -= 1
                ans += s
    print ( ans )
