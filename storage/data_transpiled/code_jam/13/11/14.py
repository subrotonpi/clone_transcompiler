def test_A ( ) :
    import sys
    import sympy
    class A ( Basic ) :
        def __init__ ( self ) :
            super ( A , self ).__init__ ( )
        def __call__ ( self ) :
            with open ( "A.txt" , "r" ) as f :
                n_case = len ( f.readlines ( ) )
                for i_case in range ( 1 , n_case + 1 ) :
                    r , t = f.readlines ( )
                    r2 = r.rstrip ( )
                    d = r2 - 1 * t ** 2 + t.rstrip ( )
                    print ( "Case #{}: {}".format ( i_case , left ) )
    A ( )
