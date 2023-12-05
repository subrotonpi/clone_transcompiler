def _main ( mat , x1 , y1 , x2 , y2 ) :
    import numpy as np
    import numpy as np
    import numpy as np
    import numpy.random as np
    import random
    from numpy.linalg.pinv import pinv
    from numpy.random import rand
    from numpy.random import choice
    N , M , Q = mat.shape [ 0 ] , mat.shape [ 1 ] , mat.shape [ 2 ]
    S = [ ]
    s0 = [ '_' ] * ( M + 1 )
    S.append ( ''.join ( s0 ) )
    for i in range ( 1 , N + 1 ) :
        S.append ( '_'.join ( [ choice ( s ) for s in S ] ) )
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
    ans = [ ]
    for q in range ( Q ) :
        x1 , y1 , x2 , y2 = rand ( q )
        cum_kuro , cum_tate , cum_yoko , cum_kuro , cum_tate , cum_yoko = cum ( kuro , x1 , y1 , x2 , y2 )
        ans.append ( cum_kuro - cum_tate - cum_yoko )
        ans.append ( '\n'.join ( ans ) )
        