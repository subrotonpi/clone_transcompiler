def main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_PY
    from sympy.core.compatibility import builtins
    try :
        a , b , c = NUMPY_PY.symbols
    except ValueError :
        print ( "NO" )
    else :
        if b - a == c - b :
            print ( "YES" )
        else :
            print ( "NO" )
