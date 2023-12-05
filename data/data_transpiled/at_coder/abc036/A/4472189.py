def main ( ) :
    import sys
    from sympy.utilities.randtest import randtest
    from sympy.utilities.lambdify import NUMPY_PY
    from sympy.utilities.lambdify import NUMPY_PY
    a = NUMPY_PY.evalf ( )
    b = NUMPY_PY.evalf ( )
    if b % a == 0 :
        print ( b / a )
    else :
        print ( b / a + 1 )
