def round1 ( ) :
    import os
    import sys
    import os
    import sys
    import random
    import time
    import sys
    class B ( object ) :
        def __init__ ( self ) :
            self.stdin = open ( '%s.in' % self.filename )
            self.stdout = open ( '%s.out' % self.filename )
            self.T = random.randint ( 1 , 4 )
            for i in range ( T ) :
                print ( 'Case #%d: %s' % ( i + 1 , B ( ).solve ( ) ) , file = self.stdout )
        def solve ( self ) :
            n , k , b , t = random.randint ( 1 , 4 )
            x , v = [ random.randint ( 1 , 4 ) for i in range ( n ) ]
            z = [ x + v [ i ] * t >= b for i in range ( n ) ]
            q = [ ]
            m = 0
            for i in range ( n - 1 , - 1 , - 1 ) :
                if z [ i ] :
                    q.append ( i )
            if m < k :
                return 'IMPOSSIBLE'
            s = 0
            for i in range ( k ) :
                j = n - i - 1
                s += ( j - q [ i ] )
            return '%s' % s
    return B ( )
