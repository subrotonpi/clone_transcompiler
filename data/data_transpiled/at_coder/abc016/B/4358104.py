def main ( ) :
    import sys
    from sympy.utilities.randtest import LongTest
    from sympy.utilities.lambdify import NUMPY_MALS
    A = NUMPY_MALS [ 0 ]
    B = NUMPY_MALS [ 1 ]
    R = NUMPY_MALS [ 2 ]
    plus = A + B == R
    muinus = A - B == R
    if plus and muinus :
        print ( "?" )
    elif plus :
        print ( "+" )
    elif muinus :
        print ( "-" )
    else :
        print ( "!" )
