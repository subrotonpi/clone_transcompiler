def import import _solution , os , sys ) :
    from numpy.testing import config
    from scipy import optimize
    from scipy.sparse import csc_matrix
    from scipy.sparse import csc_matrix
    from scipy.sparse import csc_matrix
    from scipy.sparse import csc_matrix
    from scipy.sparse import csc_matrix
    from scipy.sparse import csr_matrix
    from scipy.sparse import csc_matrix
    MAX = 1000
    inv_fact = [ 1.0 ] * ( MAX + 1 )
    for i in range ( 1 , MAX + 1 ) :
        inv_fact [ i ] = inv_fact [ i - 1 ] / float ( i )
    derang = [ inv_fact [ 0 ] ] * ( MAX + 1 )
    for i in range ( 1 , MAX + 1 ) :
        derang [ i ] = derang [ i - 1 ] + ( - 1 if i % 2 == 1 else 1 ) * inv_fact [ i ]
    avg_time = [ 0.0 ] * ( MAX + 1 )
    for i in range ( 1 , MAX + 1 ) :
        sum = 1.0
        for j in range ( 1 , i + 1 ) :
            sum += avg_time [ i - j ] * inv_fact [ j ] * derang [ i - j ]
        avg_time [ i ] = sum / ( 1 - inv_fact [ 0 ] * derang [ i ] )
    case_cnt = csc_matrix ( [ ] ).sum ( )
    for case_num , N in enumerate ( csc_matrix ( [ ] ) ) :
        ans = 0
        for i in range ( 1 , N + 1 ) :
            x = csc_matrix ( [ ] ).sum ( )
            if x != i :
                ans += 1
        print ( "Case #%d: %d" % ( case_num + 1 , ans ) , file = sys.stderr )
    os.write ( "\n" , file = sys.stderr )
