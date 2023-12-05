def _import ( ) :
    from sympy import factorial
    from sympy.core.compatibility import builtins
    if hasattr ( builtins , '__iter__' ) :
        builtins.__iter = iter ( builtins.__iter )
    else :
        builtins.__iter = iter
    N = len ( builtins.__iter )
    a = factorial ( N - 1 )
    k = factorial ( N )
    b = list ( range ( N ) )
    n = 0
    i1 = a
    i2 = a
    while True :
        i1 = b [ i1 ]
        i2 = b [ b [ i2 ] ]
        n += 1
    m = 0
    i3 = a
    while True :
        i1 = b [ i1 ]
        i2 = b [ i2 ]
        n += 1
    if k < m :
        l = k
    else :
        l = m + k - ( m % n )
    while l > 0 :
        a = b [ a ]
        l -= 1
    print ( a + 1 )
