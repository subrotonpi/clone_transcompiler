def _solve_a ( ) :
    import os
    import sys
    import os
    import sys
    class Main ( object ) :
        def solve_b ( self ) :
            with open ( os.devnull , 'w' ) as devnull :
                os.dup2 ( devnull.fileno ( ) , sys.stdin.fileno ( ) )
        def solve_a ( self ) :
            with open ( os.devnull , 'w' ) as devnull :
                num_a = 0
                num_b = 0
                try :
                    devnull.seek ( 0 )
                    num_a = os.dup2 ( devnull.fileno ( ) , sys.stdin.fileno ( ) )
                    num_b = os.dup2 ( devnull.fileno ( ) , sys.stdin.fileno ( ) )
                    print ( ( num_a - 1 ) * ( num_b - 1 ) )
                finally :
                    if devnull.fileno ( ) != sys.stdout.fileno ( ) :
                        devnull.close ( )
        def solve_d ( self ) :
            with open ( os.devnull , 'w' ) as devnull :
                num_n = os.dup2 ( devnull.fileno ( ) , sys.stdin.fileno ( ) )
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
            os.dup2 ( devnull.fileno ( ) , sys.stdin.fileno ( ) )
            count = 0
            for i in range ( 1 , num_n + 1 ) :
                if i % 2 == 0 :
                    continue
                wkres = 1
                wk = i
                for j in range ( 2 , i ) :
                    if j % 2