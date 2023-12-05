def main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_PY
    from sympy.core.compatibility import builtins
    x , y , k = NUMPY_PY.split ( )
    ans = x
    while y and k :
        ans += 1
        y -= 1
        k -= 1
    while k and x :
        ans -= 1
        x -= 1
        k -= 1
    print ( ans )
