def __main ( ) :
    from random import randint
    from sympy.utilities.misc import get_filesystem_encoding
    from sympy.core.compatibility import builtins
    from sympy.sets import FiniteSet
    from sympy.sets import Set
    from sympy.sets import Set
    from sympy.sets import Set
    from sympy.sets import Set
    from sympy.sets import Set
    N = randint ( 1 , N )
    x = [ ]
    for i in range ( N ) :
        x.append ( randint ( 1 , N ) )
    M = randint ( 1 , N )
    K = randint ( 1 , N )
    a = [ ]
    for i in range ( M ) :
        a.append ( randint ( 1 , N - 1 ) )
    map = { }
    for i in range ( N - 1 ) :
        map [ i ] = i
    for i in range ( M ) :
        temp = map [ a [ i ] - 1 ]
        map [ a [ i ] - 1 ] = map [ a [ i ] ]
        map [ a [ i ] ] = temp
    map_k = pow ( map , K )
    cur = x [ 0 ]
    for i in range ( N ) :
        print ( cur )
        if i < N - 1 :
            cur += x [ map_k [ i ] + 1 ] - x [ map_k [ i ] ]
    def pow ( m , K ) :
        ans = [ ]
        for i in range ( len ( m ) ) :
            ans.append ( i )
        while K :
            if K & 1 :
                ans = mul ( ans , m )
            m = mul ( m , m )
            K >>= 1
        return ans
    def mul ( a , b ) :
        ans = [ ]
        for i in range ( len ( a ) ) :
            ans.append ( a [ b [ i ] ] )
        return ans
    return pow ( m , K )
