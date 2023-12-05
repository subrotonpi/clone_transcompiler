def main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_PY
    from sympy.core.compatibility import builtins
    n = NUMPY_PY.symbols [ 'n' ]
    k = NUMPY_PY.symbols [ 'k' ]
    sum = 0
    for i in range ( n ) :
        x = NUMPY_PY.symbols [ 'x' ]
        sum += ( k - x ) * 2 if k - x < x else x * 2
    print ( sum )
    sys.exit ( )
