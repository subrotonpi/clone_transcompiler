def _solve_a ( ) :
    import os
    import sys
    import os
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            self.solve_b ( )
        def solve_a ( self ) :
            with open ( os.devnull , 'r' ) as f :
                num_a = f.read ( )
            num_b = f.read ( )
            print ( max ( num_a + num_b , max ( num_a - num_b , num_a * num_b ) ) )
        def solve_b ( self ) :
            with open ( os.devnull , 'r' ) as f :
                num_n = f.read ( )
            num_s = f.read ( )
            num_wk = f.read ( )
            res = 0
            num_wk = num_s
            for val1 in num_wk [ : - 1 ] :
                val2 = num_wk [ - 1 ]
                wkset_1 = set ( [ c for c in val1 ] )
                wkset_2 = set ( [ c for c in val2 ] )
                if len ( wkset_1 ) > len ( wkset_2 ) :
                    chkset = wkset_1
                    resset = wkset_2
                else :
                    chkset = wkset_2
                    resset = wkset_1
                cnt = 0
                for character in chkset :
                    if character in resset :
                        cnt += 1
                res = max ( res , cnt )
            print ( res )
    def solve_c ( self ) :
        with open ( os.devnull , 'r' ) as f :
            num_n = f.read ( )
            num_s = f.read ( )
        print ( max ( num_n , num_s ) )
    def solve_d ( self ) :
        with open ( os.devnull , 'w' ) as f :
            num_n = f.read ( )
            num_s = f.read ( )
        print ( max ( num_n , num_s ) )
    def solve_d ( self ) :
        with open ( os.devnull , 'r' ) as f :
            num_n = f.read ( )
            num_s = f.read ( )
        print ( max ( num_n , num_s ) )