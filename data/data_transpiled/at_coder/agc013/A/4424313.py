def main ( ) :
    import sys
    from random import randint
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    N = randint ( 1 , N )
    a = np.random.choice ( range ( N ) , N )
    a = np.random.choice ( a , N )
    flag = - 1
    k = a [ 0 ]
    cnt = 0
    for i in range ( 1 , N ) :
        if a [ i ] == k :
            continue
        if flag == - 1 :
            if a [ i ] > k :
                flag = 0
            else :
                flag = 1
        else :
            if flag == 0 :
                if a [ i ] < k :
                    cnt += 1
                    flag = - 1
            elif flag == 1 :
                if a [ i ] > k :
                    cnt += 1
                    flag = - 1
        k = a [ i ]
    assert_almost_equal ( cnt + 1 , 0 )
