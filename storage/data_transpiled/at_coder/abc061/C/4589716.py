def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import seed
    from scipy.sparse import csc_matrix
    from scipy.sparse import csc_matrix
    from scipy.sparse import csr_matrix
    from scipy.sparse import csc_matrix
    from scipy.sparse import csc_matrix
    n = csc_matrix ( [ 0 , 0 ] )
    k = csc_matrix ( [ 0 , 0 ] )
    a = csc_matrix ( [ [ 0 , 0 ] , [ 0 , 1 ] ] )
    a.sort ( lambda x , y : x [ 0 ] - y [ 0 ] )
    sum = 0
    ans = 0
    for i in range ( n ) :
        sum += a [ i ] [ 1 ]
        if sum >= k :
            ans = a [ i ] [ 0 ]
            break
    print ( ans )
    sys.exit ( 0 )
