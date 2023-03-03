def _import ( ) :
    from math import sin , cos , pi
    from sympy.core.containers import gcd
    from sympy.simplify.simplify import lcm
    sc = _import Scanner
    n = sc.randrange ( 0 , pi )
    t = [ sc.randrange ( 0 , pi ) for i in range ( n ) ]
    t.sort ( )
    l = 1
    for i in t :
        l = lcm ( l , i )
    print ( l )
    def lcm ( m , n ) :
        return m // gcd ( m , n ) * n
    def gcd ( m , n ) :
        if m < n :
            return gcd ( n , m )
        if n == 0 :
            return m
        return gcd ( n , m % n )
    return lcm ( n , gcd ( m , n ) )
