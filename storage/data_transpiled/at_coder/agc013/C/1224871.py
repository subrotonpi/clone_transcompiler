def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    from numpy.core import zeros
    from numpy.core import linalg
    N , L , T = map ( int , range ( N ) )
    X = zeros ( N )
    W = zeros ( N )
    x = zeros ( N )
    for i in range ( N ) :
        X [ i ] = randint ( 1 , N )
        W [ i ] = randint ( 1 , N )
        x [ i ] = X [ i ] + T * ( 3 - 2 * W [ i ] )
        while 1 :
            if x [ i ] > 0 :
                break
            x [ i ] += L
        x [ i ] %= L
    x0 = x [ 0 ]
    x.sort ( )
    cnt = 0
    if W [ 0 ] == 1 :
        for i in range ( 1 , N ) :
            if W [ i ] == 1 :
                continue
            cnt += ( 2 * T - X [ i ] + X [ 0 ] + L ) / L
        cnt %= N
    else :
        for i in range ( N - 1 , 0 , - 1 ) :
            if W [ i ] == 2 :
                continue
            cnt -= ( 2 * T - X [ 0 ] + X [ i ] ) / L
        while 1 :
            if cnt > 0 :
                break
            cnt += N
        cnt %= N
    ini = 0
    for i in range ( N ) :
        if x [ i ] == x0 :
            if i < N - 1 and x [ i + 1 ] == x0 and W [ 0 ] == 1 :
                ini = i + 1 - int ( cnt )
                break
            ini = i - int ( cnt )
            break
    for i in range ( N ) :
        print ( x [ ( ini + i + N ) % N ] )
