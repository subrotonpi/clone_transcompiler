def test_main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_FILES
    from sympy.utilities.misc import ARCH
    class Main ( NUMPY_FILES ) :
        def find_files ( self ) :
            with open ( "../README.rst" ) as f :
                n , k = NUMPY_FILES.index ( f.read ( ) )
                ans = k
                for i in range ( n - 1 ) :
                    ans *= ( k - 1 )
                print ( ans )
