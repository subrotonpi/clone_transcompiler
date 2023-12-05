def _import ( ) :
    import sys
    import os
    import os
    import sys
    class D_Large ( object ) :
        SAMPLE = False
        PROBLEM = "D"
        INPUT = "large"
        ID = "0"
        PATH = "/Users/wangkai/Documents/codejam-commandline-1.2-beta1/source/"
        def __init__ ( self ) :
            with open ( os.path.join ( PATH , PROBLEM + "-" + INPUT + "-" + ID + ".in" ) , "r" ) as infile :
                with open ( os.path.join ( PATH , PROBLEM + "-" + INPUT + "-" + ID + ".out" ) , "w" ) as outfile :
                    test = infile.read ( )
                    for t in range ( 1 , test + 1 ) :
                        outfile.write ( "Case #%d: " % t )
                        omino = infile.read ( )
                        row = infile.read ( )
                        col = infile.read ( )
                        if row * col % omino != 0 :
                            first_player_win = True
                        else :
                            min_side = min ( row , col )
                            max_side = max ( row , col )
                            if omino == 1 :
                                first_player_win = False
                            elif omino == 2 :
                                first_player_win = False
                            elif omino == 3 :
                                if min_side == 1 :
                                    first_player_win = True
                                else :
                                    first_player_win = False
                            elif omino == 4 :
                                if min_side <= 2 :
                                    first_player_win = True
                                else :
                                    first_player_win = False
                            elif omino == 5 :
                                if min_side <= 2 :
                                    first_player_win = True
                                elif min_side == 3 :
                                    first_player_win = False
                                else :
                                    first_player_win = False
                            elif omino == 6 :
                                if min_side <= 2 :
                                    first_player_win = True
                                elif min_side == 3 :
                                    first_player_win = False
                                else :
                                    first_player_win = False
                            elif omino == 7 :
                                first_player_win = True
