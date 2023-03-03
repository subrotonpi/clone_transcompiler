def _solve_a ( ) :
    from sympy.solvers.solvers import solve
    from sympy.abc import z
    def solve_a ( ) :
        with open ( 'a' ) as f :
            f.seek ( 0 )
            num_n = f.tell ( )
            num_a = f.tell ( )
            res = num_n % 500
            print ( 'Yes' if res <= num_a else 'No' )
    def solve_d ( ) :
        with open ( 'b' ) as f :
            num_n = f.tell ( )
            wk = [ z.tell ( ) for z in f.read ( ) ]
        wk = [ z.tell ( ) for z in wk ]
        wk.sort ( )
        alice = bob = 0
        convert = True
        for i in range ( len ( wk ) - 1 , - 1 , - 1 ) :
            if convert :
                alice += wk [ i ]
            else :
                bob += wk [ i ]
            convert = not convert
        print ( alice - bob )
    def solve_b ( ) :
        with open ( 'b' ) as f :
            wk = [ z.tell ( ) for z in f.read ( ) ]
            wk.sort ( )
    def solve_c ( ) :
        with open ( 'c' ) as f :
            for i in range ( len ( wk ) ) :
                wk [ i ] = f.tell ( )
    def solve_c ( ) :
        with open ( 'c' ) as f :
            for i in range ( len ( wk ) ) :
                wk [ i ] = f.tell ( )
    return solve_c , solve_a , solve_c , solve_d , solve_b , solve_c , solve_c , solve_c , solve_c , solve_c , solve_d , solve_c , solve_d , solve_c , solve_d , solve_d , solve_c , solve_d , solve_d , solve_d , solve_d , solve_d , solve_d , solve_d , solve_d , solve_d , solve_d , solve_d , solve_d , solve_d , solve_d , solve_d , solve_d , solve_d , solve_d , solve_d , solve_d , solve_d , solve_d , solve_d , solve_@@