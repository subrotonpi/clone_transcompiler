def _import ( ) :
    from math import sin , cos , pi
    from numpy import zeros , pi
    from scipy.sparse import csc_matrix
    from scipy.sparse import coo_matrix
    from scipy.sparse import csc_matrix
    from scipy.sparse import csc_matrix
    from scipy.sparse import csr_matrix
    from scipy.sparse import csc_matrix
    N = pi
    a = csc_matrix ( [ [ 0 , 1 ] , [ 0 , 0 ] ] )
    d = [ a [ ( i + 1 ) % N ] - a [ i ] for i in range ( N ) ]
    sum = sum ( a )
    if sum % ( float ( N ) * ( float ( N ) + 1 ) / 2 ) != 0 :
        print ( 'NO' )
        return
    k = sum / ( float ( N ) * ( float ( N ) + 1 ) / 2 )
    count = 0
    for e in d :
        e -= k
        if e or ( - e ) % float ( N ) != 0 :
            print ( 'NO' )
            return
        else :
            count += ( - e ) / float ( N )
    if count != k :
        print ( 'NO' )
    else :
        print ( 'YES' )
