def _solve_a ( ) :
    import os
    import sys
    import os
    import sys
    class Main ( object ) :
        def solve_b ( self ) :
            with open ( os.devnull , 'w' ) as devnull :
                num_a = 0
                num_b = 0
                try :
                    devnull.write ( ''.join ( [ str ( i ) for i in range ( len ( sys.argv ) ) ] ) )
                except :
                    sys.stderr.write ( ''.join ( [ str ( i ) for i in sys.argv [ 1 : ] ] ) )
        def solve_d ( self ) :
            with open ( os.devnull , 'w' ) as devnull :
                num_n = 0
                try :
                    devnull.write ( ''.join ( [ str ( i ) for i in sys.argv [ 1 : ] ] ) )
                finally :
                    devnull.flush ( )
    def solve_b ( self ) :
        with open ( os.devnull , 'w' ) as devnull :
            num_n = 0
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
    def solve_c ( self ) :
        with open ( os.devnull , 'w' ) as devnull :
            num_n = 0
            try :
                devnull.write ( ''.join ( [ str ( i ) for i in sys.argv [ 1 : ] ] ) )
            except :
                sys.stderr.write ( ''.join ( [ str ( i ) for i in sys.argv [ 1 : ] ] ) )
