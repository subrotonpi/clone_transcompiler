def _import ( ) :
    import sys
    from sympy.core.compatibility import builtins
    from sympy.core.compatibility import builtins
    from sympy.core.compatibility import builtins
    from sympy.core.compatibility import builtins
    from sympy.core.compatibility import builtins
    from sympy.core.compatibility import builtins
    from sympy.core.compatibility import builtins
    if not builtins.is_prime :
        builtins.prime = builtins.prime
    else :
        builtins.prime = builtins.prime
    a = int ( a )
    k = int ( a )
    if k == 0 :
        out = 2000000000000l - a
    else :
        i = 1
        t = a
        while t < 2000000000000l :
            i += 1
            t = exp ( 1 + k , i - 1 ) * a + ( exp ( 1 + k , i - 1 ) - 1 ) / k
        out = ( i - 1 )
    def exp ( a , n ) :
        if n == 0 : return 1
        if n % 2 == 0 :
            e = exp ( a , n // 2 )
            return e ** 2
        return a * exp ( a , n - 1 )
    return exp
