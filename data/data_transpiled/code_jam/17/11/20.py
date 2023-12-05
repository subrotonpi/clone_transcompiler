def main ( ) :
    import defaultdict
    class A ( dict ) :
        def __init__ ( self ) :
            self.num_cases = len ( self.num_cases )
            for q in range ( self.num_cases ) :
                num_rows , num_cols , freq = self.last_entry ( )
                grid = defaultdict ( int )
                max_row = [ - 1 ] * 26
                min_row = [ - 1 ] * 26
                max_col = [ - 1 ] * 26
                min_col = [ - 1 ] * 26
                for row in range ( num_rows ) :
                    grid [ row ] = self.grid [ row ] [ col ]
                    for col in range ( num_cols ) :
                        c = grid [ row ] [ col ]
                        if c != '?' :
                            freq [ c - 'A' ] += 1
                            max_row [ c - 'A' ] = max ( max_row [ c - 'A' ] , row )
                            min_row [ c - 'A' ] = min ( min_row [ c - 'A' ] , row )
                            max_col [ c - 'A' ] = max ( max_col [ c - 'A' ] , col )
                            min_col [ c - 'A' ] = min ( min_col [ c - 'A' ] , col )
            for c in [ 'A' , 'Z' ] :
                if freq [ c - 'A' ] > 0 :
                    for row in range ( min_row [ c - 'A' ] , max_row [ c - 'A' ] + 1 ) :
                        for col in range ( min_col [ c - 'A' ] , max_col [ c - 'A' ] + 1 ) :
                            grid [ row ] [ col ] = c
    print ( )
