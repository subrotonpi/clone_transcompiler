def test_solve_a ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.solve_b ( )
        def solve_a ( self ) :
            with open ( self.path , 'r' ) as f :
                print ( f.read ( ) )
        def solve_d ( self ) :
            with open ( self.path , 'r' ) as f :
                print ( f.read ( ) )
        def solve_b ( self ) :
            with open ( self.path , 'r' ) as f :
                num_h , num_w = f.read ( ).split ( '\n' )
                wk = [ ]
                default = [ '@' ] * num_w
                index = sys.maxint
                for i in range ( num_h ) :
                    wks = f.read ( )
                    if wks.find ( '#' ) < 0 :
                        wk.append ( default )
                    else :
                        index = min ( i , index )
                        wk.append ( wks )
                wk1 = wk [ index ]
                for i in range ( num_w ) :
                    if wk1 [ i ] == '.' :
                        count = 0
                        for j in range ( num_h ) :
                            if wk [ j ] [ i ] == '.' or wk [ j ] [ i ] == '@' :
                                count += 1
                        if count == num_h :
                            for j in range ( num_h ) :
                                wk [ j ] [ i ] = '@'
                for i in range ( num_h ) :
                    yield wk [ i ]
                if len ( wk ) != 0 :
                    print ( '\n'.join ( wk ) )
