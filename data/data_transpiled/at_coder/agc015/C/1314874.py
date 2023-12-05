def _main ( mat , x1 , y1 , x2 , y2 ) :
    import numpy as np
    import numpy as np
    import numpy.random as np
    from numpy.linalg import norm
    from numpy.random import choice
    N , M , Q = np.shape ( mat )
    S = [ ]
    s0 = [ '_' ] * ( M + 1 )
    S.append ( '_'.join ( S ) )
    for i in range ( 1 , N + 1 ) :
        S.append ( '_'.join ( S ) )
    kuro = np.zeros ( ( N + 1 , M + 1 ) )
    tate = np.zeros ( ( N + 1 , M + 1 ) )
    yoko = np.zeros ( ( N + 1 , M + 1 ) )
    for i in range ( 1 , N + 1 ) :
        ki , ti , yi = 0 , 0 , 0
        for j in range ( 1 , M + 1 ) :
            kuro [ i , j ] = kuro [ i - 1 , j ]
            tate [ i , j ] = tate [ i - 1 , j ]
            yoko [ i , j ] = yoko [ i - 1 , j ]
            if S [ i ] [ j ] == '1' :
                ki += 1
                if S [ i - 1 ] [ j ] == '1' :
                    ti += 1
                if S [ i ] [ j - 1 ] == '1' :
                    yi += 1
            kuro [ i , j ] += ki
            tate [ i , j ] += ti
            yoko [ i , j ] += yi
    for q in range ( Q ) :
        x1 , y1 , x2 , y2 = np.shape ( mat )
        cum_kuro = _sum ( kuro [ x1 : y1 + q ] )
        cum_tate = _sum ( tate [ x1 + q : x2 + q ] )
        cum_yoko = _sum ( yoko [ x1 : y1 + q ] )
        cum_kuro += _sum ( cum_kuro - cum_tate - cum_yoko )
        cum_tate += _sum ( cum_tate - cum_yoko )
    return mat [ x1 : y1 + q ]
