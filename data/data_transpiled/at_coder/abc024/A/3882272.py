def main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_PY
    from sympy.core.compatibility import builtins
    try :
        a , b , c , d , e , f = NUMPY_PY.symbols
    except ValueError :
        print ( "%s not found" % sys.argv [ 0 ] )
        return
    if e + f >= d :
        print ( e * a + f * b - c * ( e + f ) )
    else :
        print ( e * a + f * b )
