def _import ( ) :
    import os
    import os
    import sys
    import os
    class ProblemBHard ( ) :
        def cnt ( W , H , stx , sty , dx , dy ) :
            l , r = 0 , 10000000
            while r - l > 1 :
                c = ( l + r ) / 2
                if stx + c * dx >= 0 and stx + c * dx < W and sty + c * dy >= 0 and sty + c * dy < H :
                    l = c
            os.write ( '{}\n'.format ( qBeg ) , res )
    def do_main ( ) :
        with open ( 'input.txt' , 'w' ) as f :
            with open ( 'output.txt' , 'w' ) as f :
                for case_num in range ( 1 , case_num + 1 ) :
                    print ( case_num , end = '' )
                    f.write ( 'Case #{}: '.format ( case_num ) , end = '' )
                    W , H , dx1 , dy1 , dx2 , dy2 , stx , sty = [ ( 0 , 0 , 0 ) ]
                    same = False
                    for a in range ( - 100 , 100 ) :
                        for b in range ( - 100 , 100 ) :
                            if a * a + b * b > 0 and a * dx1 == b * dx2 and a * dy1 == b * dy2 :
                                same = True
                                break
                        if same :
                            used = [ False ] * 1000000
                            qx , qy = [ 0 ] * 2000000 , [ 0 ] * 2000000
                            qx [ qx ] = int ( stx )
                            qy [ qx ] = int ( sty )
                            used [ ( dy1 ) ] = True
                            while qend < qx :
                                curx = qx [ qend ]
                                cury = qy [ qend ]
                                qx [ curx ] = int ( stx )
                                qy [ cury ] = int ( sty )
    return do_main
