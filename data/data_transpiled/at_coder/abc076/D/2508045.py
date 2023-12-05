def main ( ) :
    import sys
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    n = int ( sys.argv [ 1 ] )
    t , v = [ 0 ] * ( n + 2 ) , [ 0 ] * ( n + 2 )
    t_sum = 0
    for i in range ( 1 , n + 1 ) :
        t [ i ] = int ( sys.argv [ 1 ] ) * 2
        t_sum += t [ i ]
    for i in range ( 1 , n + 1 ) :
        v [ i ] = int ( sys.argv [ 1 ] )
    v_max = [ 0 ] * ( t_sum + 1 )
    idx = 1
    for i in range ( 1 , n + 1 ) :
        for j in range ( t [ i ] ) :
            v_max [ idx + j ] = v [ i ]
        idx += t [ i ]
    idx = 0
    for i in range ( n ) :
        max = v [ i ]
        tmp = idx + 1
        while max < v_max [ tmp ] :
            max += 0.5
            v_max [ tmp ] = max
            if len ( v_max ) <= tmp :
                break
        idx += t [ i + 1 ]
    idx = t_sum + 1
    for i in range ( n + 1 , 0 , - 1 ) :
        max = v [ i ]
        tmp = idx - 1
        while max < v_max [ tmp ] :
            v_max [ tmp ] -= max
            max += 0.5
            if tmp < 0 :
                break
        idx -= t [ i - 1 ]
    ans , now = 0 , 0
    for i in range ( len ( v_max ) - 1 ) :
        ans += now * 0.5
        if v_max [ i ] < v_max [ i + 1 ] :
            ans += 0.125
            now += 0.5
        if v_max [ i + 1 ] < v_max [ i ] :
            ans -= 0.125
            now -= 0.5
    assert_almost_equal ( ans , 1.0 )
