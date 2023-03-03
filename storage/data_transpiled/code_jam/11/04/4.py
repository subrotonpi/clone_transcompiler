def code_pyam_Qualifier_D ( ) :
    import sys
    import random
    import numpy as np
    import random
    import sys
    import sys
    import os
    import sys
    import os
    import sys
    import os
    import sys
    N = len ( sys.stdin )
    for i in range ( 1 , N + 1 ) :
        T = random.randint ( 1 , N )
        a = np.random.randint ( 1 , T )
        c = 0
        for j in range ( T ) :
            if a [ j ] == j + 1 :
                c += 1
        print ( "Case #{}: {}".format ( i , float ( T ) - float ( c ) ) )
