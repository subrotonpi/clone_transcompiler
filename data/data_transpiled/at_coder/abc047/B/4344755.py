def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    from numpy.random import rand
    W , H , N = rand ( )
    x = rand ( N )
    y = rand ( N )
    a = rand ( N )
    x_min = x_max = W
    y_min = y_max = H
    for i in range ( N ) :
        x [ i ] , y [ i ] , a [ i ] = rand ( N )
    for i in range ( N ) :
        if a [ i ] == 1 :
            if x [ i ] > x_min : x_min = x [ i ]
        if a [ i ] == 2 :
            if x [ i ] < x_max : x_max = x [ i ]
        if a [ i ] == 3 :
            if y [ i ] > y_min : y_min = y [ i ]
        if a [ i ] == 4 :
            if y [ i ] < y_max : y_max = y [ i ]
    if ( x_min < x_max ) and ( y_min < y_max ) :
        ans = ( x_min - x_max ) * ( y_min - y_max )
    else :
        ans = 0
    print ( ans )
