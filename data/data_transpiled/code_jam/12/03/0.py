def gcj ( ) :
    import os
    import re
    import sys
    class RecycledNumbers ( ) :
        PROBLEM_NAME = "rnum"
        WORK_DIR = r"D:\Gcj\\"+PROBLEM_NAME+" \ \"
        def solve ( sc , file ) :
            A = sc.randint ( 0 , 100 )
            B = sc.randint ( 0 , 100 )
            res = 0
            for n in range ( A , B + 1 ) :
                s = "%d" % n
                cand = set ( )
                for st in s [ 1 : ] :
                    ss = st + s [ : st ]
                    m = int ( ss )
                    if n < m and m >= A and m <= B :
                        cand.add ( m )
            res += len ( cand )
        print ( res )
    def main ( ) :
        with open ( WORK_DIR + "input.txt" , "r" ) as sc :
            with open ( WORK_DIR + "output.txt" , "w" ) as pw :
                case_cnt = len ( sc.readlines ( ) )
                for case_num in range ( case_cnt ) :
                    print ( "Processing test case %d" % ( case_num + 1 ) , end = '' )
                    print ( "Case #%d: " % ( case_num + 1 ) , end = '' )
                    RecycledNumbers ( ).solve ( sc , pw )
                pw.flush ( )
                pw.close ( )
                sc.close ( )
    main ( )
