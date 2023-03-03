def main ( * orange ) :
    import sys
    import numpy as np
    import numpy.random
    import numpy.testing.utils as npt
    input = np.random.choice
    num_cases = input.shape [ 0 ]
    for n in range ( num_cases ) :
        N = input.shape [ 1 ]
        arr = np.random.randint ( N , size = N )
        data = np.zeros ( 2 * N )
        for i in range ( N ) :
            data [ arr [ i ] - i + N ] += 1
        score = 0
        for i in range ( 700 , 1000 ) :
            score += data [ i ]
        for i in range ( 1000 , 1300 ) :
            score -= data [ i ]
        good = score > - 40
        print ( "Case #%d: " % ( n + 1 ) )
        if good :
            print ( "GOOD" )
        else :
            print ( "BAD" )
