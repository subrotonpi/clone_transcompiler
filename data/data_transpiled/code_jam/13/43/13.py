def r2_2013 ( ) :
    import os
    import sys
    import random
    import sys
    import itertools
    import random
    import time
    import sys
    for t , cs in enumerate ( range ( sys.maxsteps ) ) :
        sys.stdout.write ( "Case #%d: " % cs )
        n = random.randrange ( sys.maxsteps )
        a = [ random.randrange ( n ) for i in range ( n ) ]
        b = [ random.randrange ( n ) for i in range ( n ) ]
        p = [ ]
        p.append ( 1 )
        go ( p , 1 )
        for i in range ( n ) :
            sys.stdout.write ( "%d " % i )
        sys.stdout.write ( "\n" )
    sys.stdout.flush ( )
    def go ( p , d ) :
        if d > len ( p ) :
            return True
        for i in range ( len ( p ) ) :
            if p [ i ] > p [ i ] :
                p [ i ] = d
                q = solve ( p )
                if q [ 0 ] [ i ] == a [ i ] and q [ 1 ] [ i ] == b [ i ] and go ( p , d + 1 ) :
                    return True
                p [ i ] = p [ i ] + 1
        return False
    def solve ( p ) :
        inc = [ 0 ] * len ( p )
        dec = [ 0 ] * len ( p )
        for i in range ( len ( p ) - 1 , - 1 , - 1 ) :
            if p [ i ] < p [ i ] and inc [ i ] > max :
                max = inc [ i ]
            inc [ i ] = max + 1
        for i in range ( len ( p ) - 1 , - 1 , - 1 ) :
            if p [ i ] < p [ i ] and inc [ i ] > max :
                max = inc [ i ]
        return inc , dec
