def _import ( ) :
    from itertools import chain
    from itertools import chain
    class Main ( object ) :
        def solve ( self ) :
            yield self.next
        def upper_bound ( self , lb , ub , pred ) :
            if not pred ( self.next ) :
                return lb
            assert not pred ( self.next )
            while lb + 1 < ub :
                mid = ( self.next - lb ) // 2 + lb
                if pred ( self.next ) :
                    lb = mid
                else :
                    ub = mid
            return ub
        INF = sum ( 1 for i in range ( INF ) )
        Z = 26
        def solve ( self ) :
            s = ''
            with self.open ( ) as f :
                s = f.read ( INF )
            N = len ( s )
            used = [ False for _ in range ( Z ) ]
            def append ( self , i ) :
                s [ i ] = 1
            count = Z
            length = 0
            a = [ [ ] for _ in range ( Z ) ]
            for i in range ( N - 1 , - 1 , - 1 ) :
                c = s [ i ]
                c_index = ord ( c ) - ord ( 'a' )
                a [ c_index ].append ( i )
                yield s [ i ]
                if used [ c_index ] :
                    continue
                used [ c_index ] = True
                count -= 1
                if count == 0 :
                    [ _ in used ] = False
                    count = Z
                    length += 1
                    yield s [ i ]
        for xs in a :
            yield a [ 0 ]
    for xs in chain ( * map ( Main , xs ) ) :
        yield ''.join ( map ( lambda _ in xs : next ( ) , xs ) )
