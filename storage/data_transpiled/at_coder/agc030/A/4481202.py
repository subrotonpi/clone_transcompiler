def main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_PY
    from sympy.core.compatibility import builtins
    A = NUMPY_PY ( 'A' )
    B = NUMPY_PY ( 'B' )
    C = NUMPY_PY ( 'C' )
    if A + B == C :
        print ( A + 2 * B )
    elif A + B < C :
        print ( A + 2 * B + 1 )
    else :
        print ( B + C )
