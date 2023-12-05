def indy ( ) :
    import os
    import numpy as np
    import numpy as np
    import numpy.random as np
    import numpy.random as np
    import numpy.random as np
    import numpy.random as np
    import numpy.random as np
    import numpy.random as np
    import numpy.random as np
    import numpy.random as np
    import numpy.random as np
    import numpy.random as np
    import numpy.random as np
    import numpy.random as np
    import random
    class IncreasingSpeedLimits ( ) :
        name = 'C-small-attempt0'
        path = 'C:/codejam/'
        with open ( path + name + '.in' , 'r' ) as sc :
            with open ( path + name + '.out' , 'w' ) as f :
                N = np.random.randint ( 1 , N )
                for z in range ( 1 , N + 1 ) :
                    n = np.random.randint ( 1 , m )
                    m = np.random.randint ( 1 , m )
                    X , Y , Z = np.random.randint ( 1 , m )
                    A = np.random.randint ( 1 , m )
                    s = np.random.randint ( 1 , n )
                    for i in range ( n ) :
                        s [ i ] = A [ i % m ]
                        A [ i % m ] = ( X * A [ i % m ] + Y * ( i + 1 ) ) % Z
                    dp = np.zeros ( n )
                    fill ( dp , 1 )
                    for i in range ( n ) :
                        for j in range ( 1 , i + 1 ) :
                            if s [ i - j ] < s [ i ] :
                                dp [ i ] = ( dp [ i ] + dp [ i - j ] ) % 1000000007
                    res = 0
                    for i in range ( n ) :
                        res = ( dp [ i ] + res ) % 1000000007
                    f.write ( 'Case #' + str ( z ) + ': ' + str ( res ) + '\n' )
                    f.write ( '\n' )
