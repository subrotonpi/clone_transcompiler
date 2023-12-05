def main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_PY
    from sympy.core.compatibility import builtins
    try :
        a = NUMPY_PY.index ( 'a' )
        if a in [ 3 , 5 , 7 ] :
            print ( 'YES' )
        else :
            print ( 'NO' )
    except ValueError :
        print ( 'NO' )
