def main ( ) :
    import sys
    from sympy.utilities.randtest import randtest
    from sympy.utilities.lambdify import NUMPY_PY
    from sympy.utilities.lambdify import NUMPY_PY
    a = NUMPY_PY.evalf ( )
    d = NUMPY_PY.evalf ( )
    if ( a + 1 ) ** d < a ** ( d + 1 ) :
        d += 1
    else :
        a += 1
    print ( a ** d )
