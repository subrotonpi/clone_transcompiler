def contest ( ) :
    import os
    import random
    import sys
    import math
    class Enclosure ( object ) :
        PROBLEM_NAME = "enclosure"
        WORK_DIR = r"D:\GCJ\"+PROBLEM_NAME+" \ "
        def solve ( sc , file ) :
            N , M , K = random.randint ( 1 , N ) , random.randint ( 1 , M )
            if N > M :
                tmp = N
                N = M
                M = tmp
            cur = [ [ ] for i in range ( N ) ]
            next = [ [ ] for i in range ( N ) ]
            for j in range ( i , N ) :
                [ cur [ i ] [ j ] , cur [ i ] [ j ] [ j - i + 1 ] , cur [ i ] [ j ] [ j - i + 1 ] ] = j - i + 1
            ans = sum ( [ i for col in range ( M ) ] )
            for col in range ( M ) :
                for i in range ( N ) :
                    for j in range ( i , N ) :
                        [ next [ i ] [ j ] , cur [ i ] [ j ] [ used ] ] = - 1
            for i in range ( N ) :
                for j in range ( i , N ) :
                    for used in range ( j ) :
                        if cur [ i ] [ j ] [ used ] == - 1 :
                            continue
                        if cur [ i ] [ j ] [ used ] >= K :
                            ans = min ( ans , used )
                        for ni in range ( i - 1 , i + 1 ) :
                            for nj in range ( j - 1 , j + 1 ) :
                                if ni in range ( 0 , j ) :
                                    nused = used - ( 0 if col == 0 else max ( 0 , j - i - 1 ) ) + ( nj - ni + 1 )
                                    next [ ni ] [ nused ] = max ( [ i , j ] [ used ] , nj - ni + 1 )
        return ans
