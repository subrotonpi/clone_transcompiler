def _solve_c ( ) :
    import os
    import sys
    import os
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.solve_c ( )
        def solve_a ( self ) :
            with open ( os.devnull , 'w' ) as devnull :
                num_a = os.read ( devnull , 1 )
                num_b = os.read ( devnull , 1 )
                print ( ( num_a - 1 ) * ( num_b - 1 ) )
                print ( '' )
        def solve_b ( self ) :
            with open ( os.devnull , 'w' ) as devnull :
                num_n = os.read ( devnull , 1 )
                count = 0
                for i in range ( 1 , num_n + 1 ) :
                    if i % 2 == 0 :
                        continue
                    wk = i
                    wkdict = { }
                    for j in range ( 2 , i ) :
                        if wk % j == 0 :
                            wk /= j
                            wkdict [ j ] = wkdict [ j ] or 1
                        else :
                            j += 1
                    wkres = 1
                    for val1 in wkdict.values ( ) :
                        wkres *= ( val1 + 1 )
                    if wkres == 8 :
                        count += 1
                print ( count )
        def solve_c ( self ) :
            with open ( os.devnull , 'w' ) as devnull :
                wks = os.read ( devnull , 1 )
                count = os.read ( devnull , 1 )
                wk = wks
                if count <= len ( wks ) :
                    wk = wks [ : int ( count ) ]
                for i in range ( len ( wk ) ) :
                    if wk [ i ] != '1' :
                        print ( wk [ i ] )
                        return
                print ( 1 )
