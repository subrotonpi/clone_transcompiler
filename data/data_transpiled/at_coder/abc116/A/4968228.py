def main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_FILES
    with open ( "README.rst" , "r" ) as f :
        ( ab , bc ) = NUMPY_FILES
        print ( ab * bc / 2 )
