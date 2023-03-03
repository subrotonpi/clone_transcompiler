def main ( ) :
    import sys
    from numpy import zeros
    from numpy.linalg import solve
    W , H , N = solve ( )
    x_ = zeros ( N )
    y_ = zeros ( N )
    a_ = zeros ( N )
    for i in range ( N ) :
        x_ [ i ] = solve ( )
        y_ [ i ] = solve ( )
        a_ [ i ] = solve ( )
    x_l = x_r = W
    y_d = y_u = H
    for i in range ( N ) :
        if a_ [ i ] == 1 :
            if x_ [ i ] > x_l : x_l = x_ [ i ]
        elif a_ [ i ] == 2 :
            if x_ [ i ] < x_r : x_r = x_ [ i ]
        elif a_ [ i ] == 3 :
            if y_ [ i ] > y_d : y_d = y_ [ i ]
        elif a_ [ i ] == 4 :
            if y_ [ i ] < y_u : y_u = y_ [ i ]
    if y_d >= y_u or x_l >= x_r :
        print ( 0 )
    else :
        print ( ( x_r - x_l ) * ( y_u - y_d ) )
