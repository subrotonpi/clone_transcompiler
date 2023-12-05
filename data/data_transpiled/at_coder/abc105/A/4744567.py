def main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_PY
    from sympy.utilities.misc import get_filesystem_encoding
    with open ( "README.rst" , "r" ) as f :
        a = eval ( f.read ( ) )
        b = eval ( f.read ( ) )
        if a % b == 0 :
            print ( 0 )
        else :
            print ( 1 )
