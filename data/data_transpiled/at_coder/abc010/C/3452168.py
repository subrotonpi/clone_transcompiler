def main ( ) :
    import math
    from numpy import sqrt
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
    N = uniform ( 0 , 1 )
    x , y = solve ( x , y )
    flag = False
    for i in range ( N ) :
        if sqrt ( pow ( x [ i ] - txa , 2 ) + pow ( y [ i ] - tya , 2 ) ) + sqrt ( pow ( x [ i ] - txb , 2 ) + pow ( y [ i ] - tyb , 2 ) ) <= T * V :
            flag = True
    if flag :
        print ( "YES" )
    else :
        print ( "NO" )
