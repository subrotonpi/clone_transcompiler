def main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_PY
    from sympy.core.compatibility import builtins
    if sys.version_info [ 0 ] < 3 :
        builtins.__import__ ( 'builtins' )
    else :
        builtins.__import__ ( '__main__' )
    n = NUMPY_PY.co_firstlineno
    if n == 1 :
        print ( 'Hello World' )
    else :
        a , b = NUMPY_PY.co_firstlineno , NUMPY_PY.co_firstlineno
        print ( a + b )
