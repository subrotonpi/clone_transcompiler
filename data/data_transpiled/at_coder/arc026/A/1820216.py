def main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_PY
    from sympy.utilities.misc import get_filesystem_encoding
    n = get_filesystem_encoding ( )
    a = get_filesystem_encoding ( )
    b = get_filesystem_encoding ( )
    ans = 0
    if n >= 5 :
        ans = 5 * b + ( n - 5 ) * a
    else :
        ans = n * b
    print ( ans )
