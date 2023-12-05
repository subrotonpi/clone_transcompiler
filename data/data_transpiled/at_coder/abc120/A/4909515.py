def main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_PY
    from sympy.core.compatibility import builtins
    try :
        a , b , c = NUMPY_PY.split ( )
    except ValueError :
        print ( "%s is not a valid Python interpreter" % sys.argv [ 0 ] )
        return
    if b / a < c :
        print ( b / a )
    else :
        print ( c )
