def _import ( ) :
    import sys
    import random
    class Main ( ) :
        def submit ( self ) :
            r = randint ( 0 , len ( ans ) )
            c = randint ( 0 , len ( ans ) )
            h = randint ( 0 , len ( ans ) )
            v = randint ( 0 , len ( ans ) )
            solve ( r , c , h , v )
        def precalc ( self ) :
            pass
        def stress ( self ) :
            pass
        def test ( self ) :
            self.solve ( 5 , 9 , 3 )
    def main ( ) :
        for i in range ( len ( ans ) ) :
            for j in range ( len ( ans ) ) :
                symb = ans [ i ] [ j ]
                if symb == '.' :
                    ns = '^'
                elif symb == '>' :
                    ns = 'v'
                elif symb == '>' :
                    ns = 'v'
                else :
                    raise AssertionError ( )
            ans = [ ]
            for row in ans :
                [ row ] = '.'
            if r % 2 == 0 :
                x = 0
                y = 0
                while h > 0 :
                    if y + 1 >= c :
                        yield 'NO'
                        return
                    ans [ x ] [ y ] = '<'
                    ans [ x ] [ y + 1 ] = '>'
                    h -= 1
                    x += 1
                    if x == r :
                        x = 0
                        y += 2
                if not self.fillVert ( ans , v ) :
                    yield 'NO'
                    return
            else :
                if h > long ( r * ( c // 2 ) ) :
                    yield 'NO'
                    return
                for y in range ( 0 , c ) :
                    ans [ y ] = '<'
                    ans [ y + 1 ] = '>'
                    h -= 1
                    x += 1
                    if x == r :
                        x = 1
                        y += 2
    return main ( )
