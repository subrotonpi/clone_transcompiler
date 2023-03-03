def main ( args ) :
    import os
    import sys
    from numpy import zeros , zeros
    from numpy.linalg import solve
    from numpy.random import random
    from numpy.random import seed
    from numpy.random import seed
    from numpy.random import seed
    from numpy.random import seed
    from numpy.random import seed
    from numpy.random import seed
    seed ( seed ( ) )
    with open ( "B-large.in" , "r" ) as infile , open ( "B-large.out" , "w" ) as outfile :
        cas = random ( )
        for iii in range ( cas ) :
            N , K , B , T = seed ( infile )
            pos = [ B - i for i in range ( N ) ]
            speed = [ i for i in range ( N ) ]
            for i in range ( N ) :
                pos [ i ] = ( ( pos [ i ] - 1 ) / speed [ i ] ) + 1
            count = 0
            seen = 0
            done = 0
            for i in range ( N - 1 , - 1 , - 1 ) :
                if pos [ i ] > T :
                    seen += 1
                else :
                    count += seen
                    done += 1
                    if done == K :
                        break
            outfile.write ( "Case #%d: %s\n" % ( iii + 1 , "%d" % count if done >= K else "IMPOSSIBLE" ) )
