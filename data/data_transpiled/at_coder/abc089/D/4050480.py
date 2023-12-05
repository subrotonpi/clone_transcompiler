def main ( ) :
    import sys
    from numpy import abs
    from numpy.linalg import solve
    from numpy.random import randint
    from numpy.random import choice
    from numpy.random import choice
    from numpy.random import randint
    H , W , D = randint ( 1 , 6 ) , randint ( 1 , 6 ) , randint ( 1 , 6 )
    A = [ [ choice ( [ - 1 , - 1 ] ) for i in range ( H ) ] for j in range ( W ) ]
    Q = randint ( 1 , 6 )
    L = [ choice ( [ - 1 , - 1 ] ) for i in range ( Q ) ]
    R = [ choice ( [ - 1 , - 1 ] ) for i in range ( Q ) ]
    A = [ [ choice ( [ - 1 , - 1 ] ) for i in range ( H * W ) ] for j in range ( W ) ]
    p = [ [ ( j , i ) for i in range ( H ) ] for j in range ( W ) ]
    l = H * W / D + 1
    dp = [ [ 0 , 0 ] for i in range ( D ) ]
    for i in range ( D ) :
        for j in range ( l ) :
            t = i + D * j
            if t + D >= H * W :
                break
            v1 = p [ t ]
            v2 = p [ t + D ]
            dp [ i ] [ j + 1 ] = dp [ i ] [ j ] + abs ( v1 [ 0 ] - v2 [ 0 ] ) + abs ( v1 [ 1 ] - v2 [ 1 ] )
    lines = [ ]
    for a , b in zip ( L , R ) :
        idx = a % D
        ans = dp [ idx ] [ b / D ] - dp [ idx ] [ a / D ]
        lines.append ( ans + "\n" )
    sys.stdout.write ( "".join ( lines ) )
