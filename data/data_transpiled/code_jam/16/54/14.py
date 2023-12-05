def test_solve_one ( ) :
    import sys
    from sympy.utilities.iterables import iterables
    from sympy.printing.latex import parse_latex
    class D ( object ) :
        def __init__ ( self , f ) :
            self.f = f
            self.g = [ ]
            for i in range ( self.size ) :
                g.append ( i )
        def bad ( self ) :
            if '0' in self.g :
                raise Error ( )
            for x in g :
                if '0' not in x :
                    return 'IMPOSSIBLE'
            ans = '0'
            for x in g [ 1 : ] :
                ans += '1'
            ans += ' '
            for x in g [ 0 : ] :
                ans += '0?'
            return ans
        def solve ( self , f ) :
            n_tests = self.size
            for i_test in range ( 1 , n_tests + 1 ) :
                f.write ( 'Case #%d: %s\n' % ( i_test , self.solve ( f ) ) )
        def run ( self ) :
            with open ( self.f , 'r' ) as f :
                f.write ( 'Case #%d: %s\n' % ( i_test , self.solve ( f ) ) )
    D ( )
