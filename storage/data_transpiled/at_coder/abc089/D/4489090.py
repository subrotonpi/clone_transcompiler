def main ( ) :
    import sys
    from numpy import zeros
    from numpy.linalg import solve
    from numpy.random import randint
    H , W , D = randint ( 1 , H * W + 1 ) , randint ( 1 , D )
    map = zeros ( ( H * W + 1 , 2 ) )
    ary = zeros ( ( H , W ) )
    ans = zeros ( ( D , H * W / D + 2 ) )
    for i in range ( H ) :
        for j in range ( W ) :
            ary [ i , j ] = randint ( 1 , H * W )
            map [ ary [ i , j ] ] [ 0 ] = i
            map [ ary [ i , j ] ] [ 1 ] = j
    for i in range ( D ) :
        for j in range ( i , H * W + 1 , D ) :
            if j == i :
                ans [ i , 0 ] = 0
            else :
                ans [ i , ( j - i ) / D ] = abs ( map [ j , 0 ] - map [ j - D , 0 ] ) + abs ( map [ j , 1 ] - map [ j - D , 1 ] )
                ans [ i , ( j - i ) / D ] += ans [ i , ( j - i ) / D - 1 ]
    Q = solve ( )
    for i in range ( Q ) :
        from_i , to_i = solve ( )
        mod = from_i % D
        if from_i < D :
            print ( ans [ mod , ( to_i - mod ) / D ] )
        else :
            print ( ans [ mod , ( to_i - mod ) / D ] - ans [ mod , ( from_i - mod ) / D ] )
