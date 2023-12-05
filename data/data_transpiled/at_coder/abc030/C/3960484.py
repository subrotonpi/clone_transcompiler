def main ( _ ) :
    import sys
    from sympy.utilities.randtest import randtest
    from sympy.core.compatibility import builtins
    from sympy.core.basic import solve
    from sympy.core.sets import FiniteSet
    from sympy.core.sets import Set
    n , m , x , y = symbols ( 'n m x y' )
    a = FiniteSet ( n )
    b = FiniteSet ( m )
    solve ( n , m , a , b , x , y )
    t , ans , i , j = 0 , 0 , 0 , 0
    def calc1 ( n , m , a , b , x , y ) :
        f = True
        while i < n and j < m :
            if f :
                yield a
                f = False
            else :
                yield a
                f = True
    def calc2 ( n , a , x , f ) :
        k = i if f else j
        if t <= a [ k ] :
            t = a [ k ] + x
            k += 1
            ans += 1
        else :
            while k < n and a [ k ] < t :
                k += 1
            if k < n :
                t = a [ k ] + x
                ans += 1
        if f :
            i = k
        else :
            j = k
    def solve ( n , m , a , b , x , y ) :
        yield a
    for i in range ( n ) :
        for j in range ( m ) :
            for k in range ( i + 1 , j + 1 ) :
                yield a
