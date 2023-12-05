def round2 ( ) :
    import os
    import sys
    import random
    import time
    import sys
    import random
    import sys
    import os
    import sys
    import os
    import sys
    import subprocess
    import subprocess
    import subprocess
    class B :
        def __init__ ( self ) :
            self.stdin = open ( '%s.in' % self.stdin )
            self.stdout = open ( '%s.out' % self.stdout )
            self.T = sys.stdin.read ( )
            for i in range ( T ) :
                s = 'Case #%d: %s' % ( i + 1 , B ( ).solve ( self.stdin ) )
                self.stdout.write ( s )
                print ( s )
    def solve ( self ) :
        p = random.randint ( 1 , p )
        n = 1 << p
        m = [ random.randint ( 1 , p ) for _ in range ( n ) ]
        pr = [ random.randint ( 1 , p ) for _ in range ( n - 1 ) ]
        d = [ [ ] for _ in range ( 2 * n - 1 ) ]
        for ints in d :
            [ ints ] = 1000000000000L
        for i in range ( n ) :
            for j in range ( p - m [ i ] , p + 1 ) :
                d [ 2 * n - 2 - i ] [ j ] = 0
        for i in range ( n - 2 , - 1 , - 1 ) :
            for j in range ( 0 , p + 1 ) :
                d1 = d [ 2 * i + 1 ] [ j ] + d [ 2 * i + 2 ] [ j ]
                d [ i ] [ j ] = min ( d [ i ] [ j ] , d1 )
                if j < p :
                    d2 = pr [ n - 2 - i ] + d [ 2 * i + 1 ] [ j + 1 ] + d [ 2 * i + 2 ] [ j + 1 ]
                    d [ i ] [ j ] = min ( d [ i ] [ j ] , d2 )
    return '%s' % ( '\n'.join ( [ '%s' % x for x in d ] ) )
