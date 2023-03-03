def _ _ main _ _ ( ) :
    import sys
    import os
    import random
    import sys
    import random
    import Solution
    import os
    import sys
    import os
    import random
    INF = 1000000000
    with open ( 'input.txt' , 'r' ) as sc :
        with open ( 'output.txt' , 'w' ) as f :
            for i in layer [ 0 ] [ i ] :
                a = i
                b = i
                if not adj [ a ] [ b ] :
                    continue
                cnt = 0
                for x in range ( 1 , layer_Sz [ - 2 ] ) :
                    a = i
                    b = j
                    if a not in F [ b ] :
                        cnt += 1
    for len in range ( 0 , layer_Sz [ 0 ] ) :
        for i in range ( 0 , layer_Sz [ 0 ] ) :
            for j in range ( 0 , layer_Sz [ 1 ] ) :
                a = i
                b = j
                if a not in F [ b ] :
                    continue
                if a in F [ b ] :
                    continue
            for i in range ( 0 , layer_Sz [ 1 ] ) :
                dist [ i ] [ j ] = INF
            for j in range ( 0 , layer_Sz [ 1 ] ) :
                dist [ i ] [ j ] = 0
            for k in range ( 0 , M ) :
                dist [ i ] [ j ] = min ( dist [ i ] [ j ] , dist [ i ] [ k ] + dist [ k ] [ j ] )
            D = dist [ 0 ] [ 1 ]
            print ( 'Case #%d: %d ' % ( case_num , D - 1 ) , end = '' )
            if D == 1 :
                cnt = 0
                for i in range ( 0 , N ) :
                    if adj [ 0 ] [ i ] :
                        cnt += 1
                    print ( cnt )
                    continue
