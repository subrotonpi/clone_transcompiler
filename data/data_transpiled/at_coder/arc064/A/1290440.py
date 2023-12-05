def import import sys , string , ** kwargs ) :
    from numpy import array
    from numpy.linalg import eigvals
    from numpy.random import randint
    from numpy.random import seed
    sc = _raw_input ( )
    N = int ( sc.sample ( ) )
    x = int ( sc.sample ( ) )
    arr = array ( range ( N ) )
    count = 0
    dp = [ ]
    for i in range ( N ) :
        if arr [ i ] > x :
            count += arr [ i ] - x
            arr.append ( x )
    for i in range ( 1 , N ) :
        if arr [ i ] + arr [ i - 1 ] > x :
            count += arr [ i ] + arr [ i - 1 ] - x
            arr.append ( x - arr [ i - 1 ] )
    print ( count )
