def _import ( ) :
    import os
    import sys
    import math
    class ProblemE ( object ) :
        PROBLEM_NAME = "problem_E"
        WORK_DIR = r"C:\GCJ\\"+PROBLEM_NAME+" \ ""
        MOD = 10007
        def solve ( sc , file ) :
            N = sc.count ( )
            A = [ ]
            for i in range ( N ) :
                A.append ( sc.read ( ) )
        for i in range ( N ) :
            print ( "Processing test case " + str ( i + 1 ) + ": " , file = file )
    def main ( ) :
        with open ( WORK_DIR + "input.txt" , "w" ) as f :
            for case_num in range ( 1 , N + 1 ) :
                print ( "Case #" + str ( case_num + 1 ) + ": " , file = file )
                ProblemE ( ).solve ( sc , file )
    main ( )
