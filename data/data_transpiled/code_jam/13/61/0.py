def _import ( ) :
    import os
    import math
    class ProblemA :
        PROBLEM_NAME = "problem_A"
        WORK_DIR = r"C:\GCJ\\"+PROBLEM_NAME+" \ ""
    class ProblemA :
        def __init__ ( self , X , N ) :
            Scanner ( open ( WORK_DIR + "input.txt" , "r" ) ).next ( )
            Scanner ( open ( WORK_DIR + "output.txt" , "w" ) ).next ( )
        def __init__ ( self , caseCnt ) :
            print ( "Processing test case " + str ( caseCnt + 1 ) )
            print ( "Case #" + str ( caseCnt + 1 ) + ": " , end = "" )
            super ( ProblemA , self ).__init__ ( )
            self.solve ( sc , file = self.output_file )
    def test ( ID ) :
        block = [ ]
        for i in range ( C ) :
            travelTime = e [ i ] - s [ i ]
            if travelTime < 0 :
                travelTime += N
            startID = mod ( s [ i ] + t [ i ] )
            meet = ID - startID
            if meet < 0 :
                meet += N
            if meet <= 2 * travelTime :
                block.append ( 2 * t [ i ] + meet )
            if meet + N <= 2 * travelTime :
                block.append ( 2 * t [ i ] + meet + N )
        block.append ( - 1 )
        block.append ( 2 * X + 1 )
        block.sort ( )
        for i in range ( C + 1 ) :
            ans = max ( ans , num_even ( block [ i ] , block [ i + 1 ] ) )
    mod ( X )
    return ( X % N + N ) % N
