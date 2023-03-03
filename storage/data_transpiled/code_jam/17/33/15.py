def round1c ( ) :
    import _probC
    class ProbC ( _probC ) :
        def setup ( self ) :
            self.bin = True
            self.bout = True
            self.in_file = 'C-small-1-attempt0.in'
            self.out_file = 'cout.txt'
        def main ( self ) :
            self.setup ( )
            self.re_direct ( )
            T = self.scanner.randint ( 0 , 100 )
            for cas in range ( 1 , T + 1 ) :
                ans = self.run ( )
                print ( 'Case #%d: %f' % ( cas , ans ) )
        def run ( self ) :
            n , k = self.scanner.randint ( 0 , 100 )
            u = self.scanner.uniform ( 0 , 1 )
            p = [ self.scanner.uniform ( 0 , 1 ) for _ in range ( n ) ]
            p = [ x for x in p if x > u ]
            limit = - 1
            for i in range ( n ) :
                if i == n - 1 or ( p [ i + 1 ] - p [ i ] ) * ( i + 1 ) > u :
                    limit = u / ( i + 1 ) + p [ i ]
                    break
                else :
                    u -= ( p [ i + 1 ] - p [ i ] ) * ( i + 1 )
            poss = 1
            for i in range ( n ) :
                if p [ i ] < limit :
                    poss *= limit
                else :
                    poss *= p [ i ]
            return poss
    return ProbC
