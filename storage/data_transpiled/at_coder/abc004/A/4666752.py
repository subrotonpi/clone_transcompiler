def test_import ( ) :
    from sympy import sin , cos
    class Main ( object ) :
        def __call__ ( self , x ) :
            return 2 * sin ( x )
    x = Main ( )
    print ( x )
