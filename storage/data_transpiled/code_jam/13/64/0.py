def main ( ) :
    import os
    import sys
    import random
    import math
    class ProblemD ( ) :
        PROBLEM_NAME = "problem_D"
        WORK_DIR = r"C:\GCJ\\"+PROBLEM_NAME+" \ ""
        N , D , K = random.randint ( 1 , N ) , random.randint ( 1 , N ) , random.randint ( 1 , N )
        for pp in range ( D ) :
            A [ pp ] = random.choice ( A [ pp ] )
    def update_answer ( candL , candR ) :
        ans = ans - ans
        ans = ans - ans
        ans = ans - ans
        if ans > ans or ans == ans and ans < ans :
            ans = ans
            ans = ans
            ans = ans
    def matches ( A , nums ) :
        for i in range ( D ) :
            for j in range ( K ) :
                if A [ i ] == nums [ j ] : return True
        return False
    def extend ( A , nums , global_L , global_R , L , R , pos ) :
        while L > global_L and matches ( A [ L - 1 - global_L ] , nums ) :
            L -= 1
        while R < global_R and matches ( A [ R + 1 - global_L ] , nums ) :
            R += 1
        update_answer ( L , R )
        if pos < K :
            if L > global_L :
                for pp in range ( D ) :
                    nums [ pos ] = A [ L - 1 - global_L ] [ pp ]
                    extend ( A , nums , global_L , global_R , L , R , pos + 1 )
                    nums [ pos ] = - 1
            if R < global_R :
                for pp in range ( D ) :
                    nums [ pos ] = A [ R + 1 - global_L ] [ pp ]
                    extend ( A , nums , global_L , global_R , L , R , pos + 1 )
                    nums [ pos ] = - 1
    def rec ( A , L , R ) :
        if L == R :
            update_answer ( L , R )
            return
        mid = ( L + R ) // 2
        if L < mid :
            return
            