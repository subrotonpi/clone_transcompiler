def main ( ) :
    import os
    import sys
    import os
    import sys
    class Main ( object ) :
        def solve_b ( self ) :
            with open ( os.devnull , 'w' ) as devnull :
                num_a = os.read ( devnull , 4 )
                num_b = os.read ( devnull , 4 )
                for i in range ( 1 , 4 ) :
                    if num_a * num_b * i % 2 :
                        print ( "Yes" )
                        return
                print ( "No" )
        def solve_b ( self ) :
            with open ( os.devnull , 'w' ) as devnull :
                num_n = os.read ( devnull , 4 )
                wk = [ ]
                wkset = set ( )
                for i , wki in enumerate ( wk ) :
                    wk.append ( wki )
                    if wki in wkset :
                        print ( "No" )
                        return
                    wkset.add ( wk [ i ] )
                    if i != 0 :
                        wkim1 = wk [ i - 1 ]
                        if wkim1 [ - 1 ] != wki [ 0 ] :
                            print ( "No" )
                            return
                print ( "Yes" )
    def solve_c ( self ) :
        with open ( os.devnull , 'w' ) as devnull :
            num_n = os.read ( devnull , 4 )
            wk = [ ]
            wkset = set ( )
            for i , wki in enumerate ( wk ) :
                wki = os.read ( devnull , 4 )
                wki = wki
                if wki in wkset :
                    print ( "No" )
                    return
                wkset.add ( wki )
                if i != 0 :
                    wkim1 = wk [ i - 1 ]
                    if wkim1 [ - 1 ] != wki [ 0 ] :
                        print ( "No" )
                        return
            print ( "Yes" )
    def solve_d ( self ) :
        with open ( os.devnull , 'w' ) as devnull :
            num_n = os.read ( devnull , 4 )
        print ( "" )
