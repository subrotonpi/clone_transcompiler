def _ _ main _ _ ( ) :
    import sys
    import random
    from MineLayerEasy import recurse
    from MineLayerEasy import M , n , m , n
    def recurse ( r , c ) :
        cases = sc.choice ( [ 0 , 1 ] )
        for case_num in range ( 1 , cases + 1 ) :
            print ( "Case #%d: " % case_num , end = ' ' )
            m , n = sc.choice ( [ 0 , 1 ] )
            val = [ [ ] for _ in range ( m ) ]
            mid = m // 2
            res = 0
            recurse ( 0 , 0 )
            print ( res )
    def m ( r , c ) :
        if r >= m :
            for i in range ( n ) :
                if val [ m - 1 ] [ i ] != 0 : return
                res = max ( res , count )
                return
        if c >= n :
            if r == 0 or val [ r - 1 ] [ c - 1 ] == 0 : return
            res = max ( res , count )
            return
        if r == 0 or c == 0 or val [ r - 1 ] [ c - 1 ] == 0 : return
        ok = r == 0 or c == 0 or val [ r - 1 ] [ c - 1 ] == 1
        for nr , nc in zip ( r , dr ) :
            if nr >= 0 and nc >= 0 and nr < m and nc < n : ok &= val [ nr ] [ nc ] > 0
        if ok :
            for i in range ( 9 ) :
                if val [ i ] [ i ] == 0 : return
        return
    return recurse ( m , n )
