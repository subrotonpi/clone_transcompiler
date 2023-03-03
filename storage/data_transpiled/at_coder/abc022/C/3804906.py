def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    from numpy.core import zeros
    from numpy.core import linalg
    from numpy.core import zeros
    from numpy.core import linalg
    from numpy.core import solve
    from numpy.core import zeros
    from numpy.core import solve
    N = randint ( 1 , N )
    M = randint ( 1 , N )
    adj = zeros ( N )
    for i in range ( N ) :
        for j in range ( N ) :
            adj [ i , j ] = 1 << 30
    for u , v , w in solve ( adj , N ) :
        adj [ u , v ] = adj [ v , u ] = w
    min_d = 1 << 30
    for s in range ( N ) :
        if adj [ s , 0 ] == 1 << 30 :
            continue
        dist = zeros ( N )
        dist [ s ] = 1 << 30
        visited = zeros ( N )
        dist [ s ] = adj [ 0 , s ]
        adj [ 0 , s ] = 1 << 30
        adj [ s , 0 ] = 1 << 30
        while True :
            min_c = 1 << 30
            u = - 1
            for n in range ( N ) :
                if not visited and dist [ n ] < min_c :
                    min_c = dist [ n ]
                    u = n
            if u == - 1 :
                break
            visited [ u ] = True
            for v in range ( N ) :
                if dist [ u ] + adj [ u , v ] < dist [ v ] :
                    dist [ v ] = dist [ u ] + adj [ u , v ]
        min_d = min ( min_d , dist )
        adj [ 0 , s ] = dist [ s ]
        adj [ s , 0 ] = dist [ s ]
    if min_d == 1 << 30 :
        print ( - 1 )
    else :
        print ( min_d )
