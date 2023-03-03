def _solve_d ( ) :
    import os
    import sys
    import os
    import sys
    class Main ( object ) :
        def solve_c ( self ) :
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
                if count > len ( wks ) :
                    for wk in wks :
                        if wk != '1' :
                            print ( wk )
                            return
                else :
                    wk = wks [ 0 : int ( count ) ]
                    for wk in wks :
                        if wk != '1' :
                            print ( wk )
                            return
    return Main ( )
