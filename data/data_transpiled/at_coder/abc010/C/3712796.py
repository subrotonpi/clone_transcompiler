def main ( ) :
    import math
    from numpy.linalg import solve
    from numpy.random import randint
    from numpy.random import uniform
    from numpy.random import uniform
    from numpy.random import uniform
    from numpy.random import uniform
    from numpy.random import uniform
    from numpy.random import uniform
    txa = uniform ( 0 , 1 )
    tya = uniform ( 0 , 1 )
    txb = uniform ( 0 , 1 )
    tyb = uniform ( 0 , 1 )
    T = uniform ( 0 , 1 )
    V = uniform ( 0 , 1 )
    n = uniform ( 0 , 1 )
    x = [ uniform ( 0 , 1 ) for _ in range ( n ) ]
    y = [ uniform ( 0 , 1 ) for _ in range ( n ) ]
    visited = [ False for _ in range ( n ) ]
    count = 0
    for _ in range ( n ) :
        if float ( uniform ( 0 , 1 ) ) / V + float ( uniform ( 0 , 1 ) ) / V <= T :
            visited [ _ ] = True
            count += 1
    if count :
        print ( "YES" )
    else :
        print ( "NO" )
