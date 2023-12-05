def main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_PY
    from sympy.core.compatibility import builtins
    try :
        a = NUMPY_PY.eval ( )
        b = NUMPY_PY.eval ( )
        mennseki = ( a * b ) - ( a * 1 ) - ( b * 1 ) + ( 1 * 1 )
        print ( mennseki )
    except NameError :
        print ( "No Python module found" )
