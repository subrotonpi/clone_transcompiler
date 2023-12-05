def rayker.gcj2017 ( ) :
    import sys
    from rayker.gcj2017 import solver
    from rayker.gcj2017 import solver
    from rayker.gcj2017 import solver
    from rayker.gcj2017 import solver
    class Solver ( solver ) :
        def solve ( self , input_stream , output_stream ) :
            n_tests = solver.num_tests
            for t in range ( 1 , n_tests + 1 ) :
                n = input_stream.next ( )
                assert stupid ( n ) == self.smart ( n )
                self.write ( t , output_stream , self.smart ( n ) )
        def smart ( n ) :
            if is_tidy ( n ) :
                return n
            int_stream = str ( n ).chars ( )
            arr = int_stream ( 0 ) + int_stream
            broken_at = - 1
            for i in range ( 1 , len ( arr ) ) :
                if arr [ i - 1 ] > arr [ i ] :
                    broken_at = i
                    break
            fix_at = - 1
            for i in range ( broken_at - 1 , - 1 ) :
                if arr [ i - 1 ] < arr [ i ] :
                    fix_at = i
                    break
            arr [ fix_at ] -= 1
            for i in range ( fix_at + 1 , len ( arr ) ) :
                arr [ i ] = 9
            collect = "".join ( arr )
            ans = int ( collect )
            return ans
        def stupid ( n ) :
            for i in range ( n , - 1 , - 1 ) :
                if is_tidy ( i ) :
                    return i
            raise RuntimeError ( "WTF?" )
        def is_tidy ( n ) :
            chars = str ( n ).chars ( )
            for i in range ( 1 , len ( chars ) ) :
                if chars [ i - 1 ] > chars [ i ] :
                    return False
            return True
        def write ( self , t , output_stream , v ) :
            output_stream.write ( "Case #%d: %d%n" % ( t , v ) )
    solver.solve ( solver )
    solver.solve ( solver )
