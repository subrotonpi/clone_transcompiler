def main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_PY
    from sympy.utilities.misc import ARCH
    A = NUMPY_PY ( 'A' )
    B = NUMPY_PY ( 'B' )
    C = NUMPY_PY ( 'C' )
    for i in range ( 1 , 100 ) :
        if ( A * i ) % B == C :
            print ( "YES" )
            return
    print ( "NO" )
