def main ( ) :
    import sys
    import random
    import numpy as np
    import scipy.optimize
    import scipy.optimize
    import scipy.optimize
    class B ( object ) :
        def __init__ ( self ) :
            self.T = int ( sys.stdin.read ( ) )
    for t in range ( 1 , T + 1 ) :
        N = np.size ( t )
        K = np.size ( t )
        d = defaultdict ( int )
        cost = np.array ( [ np.size ( t ) for i in range ( N ) ] )
        ing = np.array ( [ [ np.size ( t ) for i in range ( N ) ] for j in range ( K ) ] )
        for i in range ( N ) :
            for j in range ( K ) :
                ing [ i ] [ j ] = np.random.randint ( N )
                for k in range ( 0 , 1000000 ) :
                    percent = float ( ing [ i ] [ j ] ) / float ( k * cost [ i ] )
                    if percent <.9 :
                        break
                    if percent <= 1.1 and percent >=.9 :
                        if k not in d :
                            temp = [ i * K + j ]
                            d [ k ] = temp
                        else :
                            temp = d [ k ]
                            temp.append ( i * K + j )
    used = [ False ] * N * K
    sol = 0
    for mult in d.keys ( ) :
        prev = True
        while prev == True :
            list = d [ mult ]
            seen = np.copy ( list )
            seen.reverse ( )
            for i in list :
                if i in used :
                    continue
                if seen [ i // K ] == - 1 :
                    seen [ i // K ] = i
                elif ing [ seen [ i // K ] / K ] [ seen [ i // K ] % K ] > ing [ i // K ] [ i % K ] :
                    seen [ i // K ] = i
    print ( "Case #%d: %d" % ( t , sol ) )
