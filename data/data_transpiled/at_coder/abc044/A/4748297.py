def main ( ) :
    import sys
    from sympy.utilities.randtest import randtest
    from sympy.utilities.lambdify import NUMPY_PY
    from sympy.utilities.lambdify import NUMPY_PY
    n = NUMPY_PY.evalf ( )
    k = NUMPY_PY.evalf ( )
    x = NUMPY_PY.evalf ( )
    y = NUMPY_PY.evalf ( )
    sum = 0
    if n <= k :
        sum = n * x
    else :
        sum = k * x
        sum = sum + ( ( n - k ) * y )
    print ( sum )
