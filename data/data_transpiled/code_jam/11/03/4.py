def code_pyam_Qualifier_C ( ) :
    import sys
    import random
    import sys
    import sys
    import sys
    import random
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import os
    import sys
    import random
    import sys
    T = random.randint ( 1 , 10000 )
    for t in range ( 1 , T + 1 ) :
        N = random.randint ( 1 , 10000 )
        min = 99999999
        cur = 0
        tot = 0
        for i in range ( N ) :
            X = random.randint ( 1 , 10000 )
            tot += X
            min = min ( min , X )
            cur = cur ^ X
        sys.stdout.write ( 'Case #%d: ' % t )
        if cur != 0 :
            sys.stdout.write ( 'NO' )
        else :
            sys.stdout.write ( tot - min )
