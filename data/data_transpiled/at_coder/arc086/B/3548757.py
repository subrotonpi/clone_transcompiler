def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    from numpy.core import zeros
    from numpy.random import seed
    N = randint ( 1 , N )
    A = solve ( )
    pmaxnum = pmax = mmaxnum = mmax = 0
    for i in range ( N ) :
        if A [ i ] >= 0 :
            if pmax <= A [ i ] :
                pmax = A [ i ]
                pmaxnum = i + 1
        else :
            if mmax >= A [ i ] :
                mmax = A [ i ]
                mmaxnum = i + 1
    print ( N * 2 - 2 )
    if abs ( pmax ) >= abs ( mmax ) :
        for i in range ( 1 , N + 1 ) :
            if i != pmaxnum :
                print ( pmaxnum , i )
        for i in range ( 1 , N ) :
            print ( i , i + 1 )
    else :
        for i in range ( 1 , N + 1 ) :
            if i != mmaxnum :
                print ( mmaxnum , i )
        for i in range ( N , 1 , - 1 ) :
            print ( i , i - 1 )
