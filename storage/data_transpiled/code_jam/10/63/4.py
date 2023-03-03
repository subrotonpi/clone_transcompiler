def _solve_easy ( ) :
    import os
    import sys
    import random
    import sys
    class SolveEasy ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            self.caseCnt = 1
            self.caseNum = sc.randint ( 1 , 5 )
            self.inputData ( )
            self.outputData ( )
            self.sc.close ( )
        def solve ( self ) :
            res = 1000
            dp = [ [ ] for _ in range ( 61 , 31 , 21 ) ]
            for A in range ( 0 , 60 ) :
                for B in range ( 0 , 30 ) :
                    for C in range ( 0 , 20 ) :
                        dp [ A ] [ B ] [ C ] = 1000
                        if self.maxSpent >= 1 :
                            best = - 1
                            best = max ( best , A == 0 , - 1 )
                            dp [ A ] [ B ] [ C ] = min ( dp [ A ] [ B ] [ C ] , best + 1 )
                        if self.maxSpent >= 2 :
                            best = - 1
                            best = max ( best , A < 2 , - 1 )
                            dp [ A ] [ B ] [ C ] = min ( dp [ A ] [ B ] [ C ] , best + 1 )
                        if self.maxSpent >= 3 :
                            best = - 1
                            best = max ( best , A < 3 , - 1 )
                            dp [ A ] [ B ] [ C ] = min ( dp [ A ] [ B ] [ C ] , best + 1 )
                        if self.dp [ A ] [ B ] [ C ] >= self.caseNum and A + B + C < res :
                            res = A + B + C
            self.outputData ( )
            self.caseCnt = 1
    def solve ( self ) :
        res = 0
        self.caseCnt = 1
        self.caseCnt = 1
        self.caseCnt = 0
        self.outputData ( )
        self.caseCnt = 1
        self.caseCnt = 0
        self.caseCnt = 0
        self.caseCnt = 0
        self.caseCnt = 0
        self.caseCnt = 0
        self.caseCnt = 0
        self.caseCnt = 0
    def solve ( self ) :
        return solve
    