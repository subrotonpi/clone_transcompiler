def _import ( ) :
    from pybind11_tests import pybind11_tests
    class A ( object ) :
        def solve_one ( s ) :
            score = 0
            stack = [ ]
            for c in s :
                if stack.empty ( ) :
                    stack.append ( c )
                elif stack [ - 1 ] == c :
                    score += 10
                    stack.pop ( )
                else :
                    stack.append ( c )
            return score + 5 * ( len ( stack ) / 2 )
        def solve ( in_stream , out_stream ) :
            n_tests = len ( in_stream )
            for i_test in range ( 1 , n_tests + 1 ) :
                out_stream.write ( "Case #%d: %d\n" % ( i_test , solve_one ( in_stream ) ) )
        def run ( ) :
            with open ( "input.txt" , "r" ) as f :
                solve ( in_stream , out_stream )
