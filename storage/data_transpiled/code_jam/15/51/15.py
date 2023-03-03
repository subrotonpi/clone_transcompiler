def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            self.solve ( )
        def update ( self ) :
            cin = sys.stdin
            T = cin.randint ( 1 , 100 )
            for C in range ( 1 , T + 1 ) :
                N = cin.randint ( 1 , N )
                D = cin.randint ( 1 , N )
                S = [ ]
                M = [ ]
                S.append ( cin.randint ( 1 , N ) )
                As = cin.randint ( 1 , N )
                Cs = cin.randint ( 1 , N )
                Ms = cin.randint ( 1 , N )
                M.append ( cin.randint ( 1 , N ) )
                Am = cin.randint ( 1 , N )
                Cm = cin.randint ( 1 , N )
                Mm = cin.randint ( 1 , N )
                for i in range ( 1 , N ) :
                    S.append ( ( S [ i - 1 ] * As + Cs ) % Ms )
                    M.append ( ( M [ i - 1 ] * Am + Cm ) % Mm )
                appear = [ True for i in range ( 1000 * 1000 + 7 ) ]
                tree = genTree ( N , S , M )
                max = 0
                for i in range ( max ( 0 , S [ 0 ] - D ) , S [ 0 ] + D ) :
                    if appear [ i ] :
                        max = max ( max , solve ( tree , i , i + D ) )
                print ( "Case #%d: %d" % ( C , max ) )
        def solve ( self , min , max ) :
            return self.nodes - self.count ( min , max )
    def genTree ( self , N , S , M ) :
        trees = [ ]
        for i in range ( N ) :
            trees.append ( Tree ( S [ i ] ) )
            if i > 0 :
                parent = M [ i ] % i
                trees [ parent ].child.append ( trees [ i ] )
        for i in range ( N - 1 , - 1 ) :
            trees [ i ].update ( )
    