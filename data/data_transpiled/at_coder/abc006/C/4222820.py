def _import ( ) :
    from sympy.utilities.randtest import Normal
    from sympy.utilities.lambdify import NUMPY_COMPILED
    with open ( "../../../../api/python/solver1.py" , "r" ) as sc :
        N = eval ( sc.read ( ) )
        M = eval ( sc.read ( ) )
        solver1 ( N , M )
    def solver1 ( N , M ) :
        for n1 in range ( 0 , N ) :
            n2 = - M + 4 * N - 2 * n1
            n3 = M - 3 * N + n1
            if n3 >= 0 and n2 >= 0 :
                out ( n1 , n2 , n3 )
                exit ( 0 )
        out ( "-1 -1 -1" )
    def solver ( N , M ) :
        for n1 in range ( 0 , N ) :
            for n2 in range ( 0 , N - n1 ) :
                n3 = N - n1 - n2
                if n1 * 2 + n2 * 3 + n3 * 4 == M :
                    out ( n1 , n2 , n3 )
                    exit ( 0 )
        out ( "-1 -1 -1" )
