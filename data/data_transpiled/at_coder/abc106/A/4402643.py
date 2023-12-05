def main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_PY
    sc = NUMPY_PY.exec ( 'from sympy import *' )
    a = int ( sc.evalf ( ) ) - 1
    b = int ( sc.evalf ( ) ) - 1
    print ( a * b )
