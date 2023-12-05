def main ( ) :
    import sys
    import numpy as np
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    inputs = np.random.randint ( 1 , inputs )
    for case_num in range ( 1 , inputs + 1 ) :
        blocks = np.random.randint ( 1 , inputs )
        naomi = np.random.rand ( blocks )
        ken = np.random.rand ( blocks )
        ken = np.random.rand ( blocks )
        ken = np.array ( ken )
        ken = np.array ( naomi )
        normal = 0
        i = 0
        j = 0
        while i < blocks and j < blocks :
            if naomi [ i ] < ken [ j ] :
                i += 1
                j += 1
                normal += 1
            else :
                j += 1
        normal = blocks - normal
        cheat = 0
        i = 0
        j = 0
        while i < blocks and j < blocks :
            if naomi [ i ] > ken [ j ] :
                i += 1
                j += 1
                cheat += 1
            else :
                i += 1
        assert_almost_equal ( normal , cheat , normal )
