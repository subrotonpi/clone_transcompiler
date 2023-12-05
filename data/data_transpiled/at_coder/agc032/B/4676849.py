def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    from numpy.core import zeros
    from numpy.core import linalg
    from numpy.core import zeros
    from numpy.core import linalg
    from numpy.core import log
    n = randint ( 1 , n )
    m = 0
    if n % 2 == 0 :
        m = ( n - 2 ) * n // 2
        ans = zeros ( ( m , 2 ) )
        c = 0
        for i in range ( 1 , n ) :
            for j in range ( i + 1 , n + 1 ) :
                if i + j == n + 1 :
                    continue
                ans [ c ] [ 0 ] = i
                ans [ c ] [ 1 ] = j
                c += 1
    else :
        n2 = n - 1
        m = ( n2 - 2 ) * n2 // 2 + n2
        ans = zeros ( ( m , 2 ) )
        c = 0
        for i in range ( 1 , n ) :
            for j in range ( i + 1 , n + 1 ) :
                if i + j == n :
                    continue
                ans [ c ] [ 0 ] = i
                ans [ c ] [ 1 ] = j
                c += 1
    print ( m )
    for i in range ( m ) :
        print ( ans [ i ] [ 0 ] , ans [ i ] [ 1 ] )
