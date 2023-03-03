def main ( ) :
    import sys
    import random
    import math
    class B ( object ) :
        def __init__ ( self ) :
            self.T = int ( random.randint ( 1 , 10000 ) )
    for zz in range ( 1 , T + 1 ) :
        N = random.randint ( 1 , 10000 )
        MC = [ 0 ] * 10000
        for i in range ( N ) :
            MC [ i - 1 ] += 1
        ans = 0
        C = [ 0 ] * 10000
        E = [ 0 ] * 10000
        for i in range ( 1 , N + 1 ) :
            good = True
            for j in range ( 10000 ) :
                C [ j ] = MC [ j ]
            [ E ] = 0
            for j in range ( 10000 ) :
                while C [ j ] > 0 :
                    legal = True
                    if j + i > 10000 :
                        legal = False
                    else :
                        for k in range ( i ) :
                            if C [ j + k ] == 0 :
                                legal = False
                    if legal :
                        for k in range ( i ) :
                            C [ j + k ] -= 1
                        if j + i < 10000 :
                            E [ j + i ] += 1
                    else :
                        if E [ j ] > 0 :
                            E [ j ] -= 1
                            C [ j ] -= 1
                            if j + 1 < 10000 :
                                E [ j + 1 ] += 1
                        else :
                            good = False
                            break
            if good :
                ans = i
        print ( 'Case #%d: %d\n' % ( zz , ans ) )
