def _solve_one ( s ) :
    import sys
    from sympy.utilities.iterables import variations
    from sympy.printing.debuggers import SYMPY_DEBUG
    def solve ( f , s ) :
        res = ""
        for c in s :
            r1 = res + c
            r2 = c + res
            if r1 > r2 :
                res = r1
            else :
                res = r2
        return res
    def solve ( f , s ) :
        n_tests = len ( s )
        for i_test in range ( 1 , n_tests + 1 ) :
            f.write ( "Case #%d: %s\n" % ( i_test , solve_one ( f.next ( ) ) ) )
    def run ( ) :
        with open ( "input.txt" , "r" ) as f :
            with open ( "output.txt" , "w" ) as f :
                f.write ( "" )
    return solve ( )
