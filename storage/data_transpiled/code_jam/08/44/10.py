def _import ( ) :
    import locale
    import sys
    class D_as_fast ( locale.Differ ) :
        def __init__ ( self ) :
            self.k = 0
            self.n = 0
            self.s = ''
            self.best = 0
        def solve ( self ) :
            with open ( 'D-large.in' , 'w' ) as f :
                f.write ( '\n' )
    def main ( ) :
        with open ( 'D-large.out' , 'w' ) as f :
            f.write ( '\n' )
    def solve ( ) :
        with open ( 'D-large.out' , 'w' ) as f :
            f.write ( '\n' )
    for test in range ( testn ) :
        k , s , n = select.select ( [ ] , [ ] , [ ] , [ ] )
        ds = [ [ 0 ] * k for i in range ( k ) ]
        dd = [ [ 0 ] * k for i in range ( k ) ]
        for i in range ( n ) :
            for j in range ( k ) :
                for l in range ( n // k ) :
                    if s [ l * k + i ] != s [ l * k + j ] :
                        ds [ i ] [ j ] += 1
                    if l < n // k - 1 and s [ l * k + i ] != s [ ( l + 1 ) * k + j ] :
                        dd [ i ] [ j ] += 1
        best = sys.maxsize
        a = [ [ 1 << k ] * ( k - 1 ) + dd [ i ] for i in range ( k ) ]
        for f in range ( k ) :
            for i in range ( k ) :
                [ a [ i ] [ f ] ] = sys.maxsize
            a [ f ] [ 1 << f ] = 0
            for j in range ( 1 << f ) :
                for l in range ( k ) :
                    if a [ l ] [ j ] != sys.maxsize :
                        for i in range ( k ) :
                            if ( j & ( 1 << i ) ) == 0 :
                                a [ i ] [ j | ( 1 << i