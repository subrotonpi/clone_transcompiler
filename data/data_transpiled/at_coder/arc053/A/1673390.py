def main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_FILES
    with open ( 'README.rst' ) as f :
        h , w = NUMPY_FILES.read ( ).split ( )
        ans = ( w - 1 ) * h + ( h - 1 ) * w
        print ( ans )
