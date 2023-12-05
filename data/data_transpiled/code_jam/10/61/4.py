def _solve_easy ( ) :
    import os
    import sys
    import random
    import sys
    class SolveEasy ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            self.casecnt , self.casenum = sc.randint ( 1 , 2 )
            self.inputData ( )
            self.outputData ( )
            self.sc.flush ( )
            self.sc.close ( )
        def solve ( self ) :
            N = len ( self.c )
            dp = [ [ 0 ] * N for i in range ( N ) ]
            memo = [ [ 0 ] * N for i in range ( N ) ]
            for i in range ( N ) :
                j = i
                for col in range ( 3 ) :
                    dp [ i ] [ j ] [ col ] = 0 if c [ i ] == col else 1
                memo [ i ] [ j ] = 1
            for l in range ( 2 , N + 1 ) :
                for i in range ( 0 , l + 1 ) :
                    j = i + l - 1
                    memo [ i ] [ j ] = 1000000
                    for col in range ( 3 ) :
                        dp [ i ] [ j ] [ col ] = 1000000
                        if c [ i ] == col :
                            dp [ i ] [ j ] [ col ] = min ( dp [ i ] [ j ] [ col ] , dp [ i + 1 ] [ j ] [ col ] )
                        for k in range ( i , j ) :
                            dp [ i ] [ j ] [ col ] = min ( dp [ i ] [ j ] [ col ] , memo [ i ] [ k ] + dp [ k + 1 ] [ j ] [ col ] )
                    memo [ i ] [ j ] = min ( dp [ i ] [ j ] [ 0 ] , dp [ i ] [ j ] [ 1 ] )
                    memo [ i ] [ j ] = min ( memo [ i ] [ j ] , dp [ i ] [ j ] [ 2 ] )
                    memo [ i ] [ j ] += 1
        res = memo [ 0 ] [ N - 1 ] * 2 + 1
    return SolveEasy
