def _import ( ) :
    import sys
    import os
    import os
    import sys
    import __builtin__ as io
    import __builtin__ as io
    class Main ( object ) :
        sc = io.open
        N = sc.randint
        M = sc.randint
        INF = 1000000007L
        def __init__ ( self , left , right ) :
            if left >= right :
                return
            p = left , right
            tmp , tmp1 , tmp2 = map ( int , map ( lambda x : x , map ( lambda x : x , map ( lambda x : x , map ( lambda x : x , range ( N ) ) ) ) ) )
            d [ 0 ] = 0
            d [ 0 ] = 0
            d [ r ] = 1
            d [ 1 ] = 1
            d [ r ] = 1
        def quick_sort ( self , left , right ) :
            if left >= right :
                return
            left = left
            right = right
            while left <= right :
                left += right
            while left <= right :
                left -= right
            if left <= right :
                tmp = d [ left ] [ 0 ]
                d [ left ] [ 0 ] = tmp
                tmp1 = d [ left ] [ 1 ]
                d [ left ] [ 1 ] = tmp2
                d [ left ] [ 1 ] = 1
            for i in range ( N ) :
                for j in range ( N ) :
                    time [ i ] [ j ] = INF
            for k in range ( M ) :
                for i in range ( N ) :
                    for j in range ( N ) :
                        time [ i ] [ j ] = min ( time [ i ] [ j ] , time [ i ] [ k ] + time [ k ] [ j ] )
            for i in range ( N ) :
                for j in range ( N ) :
                    if i != j :
                        bus [ i ] [ 0 ] = max ( bus [ i ] [ 0 ] , time [ i ] [ j ] )
            for i in range ( N ) :
                pass
    return Main ( )
