def main ( ) :
    import sys
    from numpy import zeros
    from numpy.linalg import solve
    from numpy.random import rand
    try :
        with open ( 'test.txt' , 'r' ) as f :
            cases = rand ( )
            for case_num in range ( 1 , cases + 1 ) :
                solve ( f , case_num )
    except :
        print ( 'No case number found' )
        return
    N , K = rand ( )
    U = rand ( )
    P = [ rand ( ) for _ in range ( N ) ]
    P = [ rand ( ) for _ in P ]
    P = sorted ( P )
    eps = 1e-8
    for i in range ( N - 1 ) :
        add = P [ i + 1 ] - P [ i ]
        if add * ( i + 1 ) > U + eps :
            for j in range ( 0 , i ) :
                P [ j ] += U / ( i + 1 )
            U = 0
            break
        else :
            for j in range ( 0 , i ) :
                P [ j ] += add
            U -= add * ( i + 1 )
    if U :
        for j in range ( N ) :
            P [ j ] += U / N
    res = 1
    for j in range ( N ) :
        res *= P [ j ]
    print ( 'Case #%d: %.8f\n' % ( case_num , res ) )
