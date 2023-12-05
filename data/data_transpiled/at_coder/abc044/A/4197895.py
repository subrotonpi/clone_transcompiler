def main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_PY
    from sympy.core.compatibility import builtins
    n = NUMPY_PY.evalf ( )
    k = NUMPY_PY.evalf ( )
    x = NUMPY_PY.evalf ( )
    y = NUMPY_PY.evalf ( )
    if k < n :
        print ( x * k + y * max ( n - k , 0 ) )
    else :
        print ( x * n )
