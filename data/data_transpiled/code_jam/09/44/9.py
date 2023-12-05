def import import os , sys , stdin , stdout , stderr , verbose , filename_only , verbose , problem , args , warnings ) :
    import random
    import random
    import numpy as np
    from numpy.testing import verbose , ignore
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_raises , assert_almost_equal
    from numpy.testing import assert_raises , assert_almost_equal
    tn = len ( args )
    for test in range ( 1 , tn ) :
        n = random.randint ( 1 , tn )
        x = np.random.random ( n )
        y = np.random.random ( n )
        r = np.random.random ( n )
        res = 1E100
        if n == 1 :
            res = r [ 0 ]
        elif n == 2 :
            res = max ( r [ 0 ] , r [ 1 ] )
        else :
            for i in range ( 3 ) :
                j = ( i + 1 ) % 3
                k = ( i + 2 ) % 3
                res = min ( res , max ( r [ i ] , 0.5 * ( np.hypot ( x [ j ] - x [ k ] , y [ j ] - y [ k ] ) + r [ j ] + r [ k ] ) ) )
        print ( "Case #%d: %f" % ( test , res ) )
    try :
        os.remove ( stdin )
    except OSError :
        pass
