def _ _ main _ _ ( ) :
    import sys
    import os
    import math
    class ProblemB :
        def do_main ( self ) :
            with open ( 'input.txt' , 'r' ) as sc :
                with open ( 'output.txt' , 'w' ) as f :
                    self.do_main ( )
        def do_main ( self ) :
            with open ( 'input.txt' , 'r' ) as sc :
                with open ( 'output.txt' , 'w' ) as f :
                    self.do_main ( )
    case_cnt = len ( sys.argv )
    for case_num in range ( 1 , case_cnt + 1 ) :
        print ( 'Case #%d: ' % case_num , end = ' ' )
        N = sc.read ( )
        M = sc.read ( )
        A = sc.read ( )
        if A > N * M :
            print ( 'IMPOSSIBLE' , file = sys.stderr )
            continue
        x2 = 1
        y1 = M
        while y1 * x2 < A :
            x2 += 1
        x1 = 1
        y2 = x2 * y1 - A
        print ( '{0} {1} {2} {3} {4}'.format ( 0 , 0 , x1 , y1 , x2 , y2 ) , file = sys.stderr )
