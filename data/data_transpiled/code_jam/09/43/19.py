def _import ( ) :
    import os
    import numpy as np
    import numpy as np
    import numpy as np
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
    import random
    class C ( object ) :
        def max_matching ( self , d ) :
            n1 = len ( d )
            n2 = len ( d [ 0 ] )
            matching = np.zeros ( n2 )
            fill ( matching , - 1 )
            matches = 0
            for u in range ( n1 ) :
                vis = np.zeros ( n1 )
                if find_path ( u , d , matching , vis ) :
                    matches += 1
            return matches
        def find_path ( u , d , matching , vis ) :
            if not vis [ u ] :
                vis [ u ] = True
                for v in range ( len ( matching ) ) :
                    if d [ u ] [ v ] and ( matching [ v ] == - 1 or find_path ( matching [ v ] , d , matching , vis ) ) :
                        matching [ v ] = u
                        return True
            return False
        def main ( self ) :
            name = "C-large"
            path = "C:/codejam/"
            with open ( path + name + ".in" , "r" ) as f :
                f.write ( "%s\n" % ( path + name + ".out" ) )
    test_cases = np.random.randint ( 1 , 10 )
    for case in range ( 1 , test_cases + 1 ) :
        n , k = np.shape ( prices )
        prices = np.zeros ( ( n , k ) )
        for i , j in zip ( range ( n ) , range ( k ) ) :
            ok = True
            for p in range ( n ) :
                if prices [ i ] [ p ] <= prices [ j ] [ p ] :
                    ok = False
                    break
            if ok :
                d [ case ] = True
    res = n - max_matching ( d )
    print ( " Case SPACETOKEN