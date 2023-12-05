def main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_PY
    with open ( 'README.rst' ) as f :
        n , k = NUMPY_PY.readline ( ).split ( )
        ans = k
        for i in range ( n - 1 ) :
            ans *= ( k - 1 )
        print ( ans )
