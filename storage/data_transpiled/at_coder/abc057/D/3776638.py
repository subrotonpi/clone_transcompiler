def main ( ) :
    import sys
    import random
    import numpy as np
    from numpy.testing import assert_almost_equal
    MAX = 50
    def comb_logic ( n ) :
        sc = np.random.choice ( range ( n ) , MAX + 1 )
        n = sc.randint ( 0 , n )
        a = sc.randint ( 0 , n )
        b = sc.randint ( 0 , n )
        c = comb ( n )
        v = [ sc.randint ( 0 , n ) for i in range ( n ) ]
        v.sort ( key = lambda x : x [ 0 ] )
        sum = 0
        for i in range ( a ) :
            sum += v [ i ]
        ave = float ( sum ) / a
        a_in_cnt = a_cnt = 0
        for i in range ( n ) :
            if v [ i ] == v [ a - 1 ] :
                a_cnt += 1
                if i < a :
                    a_in_cnt += 1
        ans = 0
        if v [ 0 ] == v [ a - 1 ] :
            for i in range ( a , b + 1 ) :
                ans += c [ a_cnt ] [ i ]
        else :
            ans += c [ a_cnt ] [ a_in_cnt ]
        print ( '%.6f' % ave )
        print ( ans )
    def comb ( n ) :
        c = np.zeros ( ( MAX + 1 , MAX + 1 ) )
        for i in range ( 1 , n + 1 ) :
            for j in range ( 0 , n + 1 ) :
                if j == 0 or i == j :
                    c [ i ] [ j ] = 1
                    continue
                c [ i ] [ j ] = c [ i - 1 ] [ j - 1 ] + c [ i - 1 ] [ j ]
        return c
    return comb_logic
