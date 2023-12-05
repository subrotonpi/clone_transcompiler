def main ( args ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_PY
    from sympy.utilities.misc import get_filesystem_encoding
    n = get_filesystem_encoding ( )
    ans = 1
    for i in range ( 1 , n ** 2 + 1 ) :
        ans = i * i
    print ( ans )
