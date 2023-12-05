def main ( ) :
    import sys
    from numpy import zeros , zeros
    from numpy import abs
    from numpy import zeros
    from numpy import abs
    from numpy import zeros
    from numpy import zeros
    from numpy import abs
    N = zeros ( N )
    T = zeros ( N )
    A = zeros ( N )
    hairetu = zeros ( N )
    H = zeros ( N )
    for i in range ( N ) :
        H [ i ] = N [ i ]
        hairetu [ i ] = T - H [ i ] * 0.006
    hairetu2 = zeros ( N )
    for i in range ( N ) :
        ans = A - hairetu [ i ]
        hairetu2 [ i ] = abs ( ans )
    i = 0
    p = 1
    min = hairetu2 [ 0 ]
    for i in range ( 1 , N ) :
        if min > hairetu2 [ i ] :
            min = hairetu2 [ i ]
            p = i
    if p == 1 :
        print ( 1 )
    else :
        print ( p + 1 )
