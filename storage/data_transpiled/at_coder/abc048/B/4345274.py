def main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_FILES
    with open ( "README.rst" ) as f :
        a , b , x = NUMPY_FILES.read ( ).split ( )
        if a != 0 :
            ans = b / x - ( a - 1 ) / x
        else :
            ans = b / x + 1
        print ( ans )
