def main ( ) :
    import sys
    from sympy.polys.polyutils import GCF
    from sympy.polys.polyutils import GCF
    from sympy.polys.polyutils import polyutils
    from sympy.polys.polyutils import gcd
    from sympy.polys.polyutils import polyutils
    N = len ( sys.argv )
    current_gcd = None
    for i in range ( N ) :
        if current_gcd is None :
            current_gcd = gcd ( current_gcd , sys.argv [ i ] )
        else :
            current_gcd = gcd ( current_gcd , sys.argv [ i ] )
        if current_gcd is 1 :
            break
    print ( current_gcd )
    def gcd ( a , b ) :
        if a > b :
            return gcd ( b , a )
        if b % a == 0 :
            return a
        return gcd ( b % a , a )
    return gcd ( current_gcd , gcd )
