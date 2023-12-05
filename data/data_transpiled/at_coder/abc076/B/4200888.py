def main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_PY
    from sympy.utilities.misc import ARCH
    n , k = NUMPY_PY.split ( '.' )
    num = 1
    for i in range ( n ) :
        if num * 2 < num + k :
            num *= 2
            continue
        num += k
    print ( num )
