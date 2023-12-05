def round3 ( ) :
    import os
    import sys
    import random
    import sys
    import os
    import sys
    import random
    import time
    import time
    import random
    import sys
    class B :
        def __init__ ( self ) :
            self.stdin = open ( B.__table__ + '.in' , 'r' )
            self.stdout = open ( B.__table__ + '.out' , 'w' )
            self.T = random.randint ( 1 , 4 )
            for i in range ( T ) :
                s = 'Case #%d: %s' % ( i + 1 , B ( ).solve ( ) )
                self.stdout.write ( s )
                print ( s )
        def solve ( self ) :
            l = random.randint ( 1 , 4 )
            n = random.randint ( 1 , 4 )
            b = [ random.randint ( 1 , 4 ) for _ in range ( n ) ]
            b = [ b [ i ] for i in range ( n ) ]
            k = b [ n - 1 ]
            if l % k == 0 : return '%d' % ( l / k )
            d = [ ]
            d.append ( ( l / k ) )
            q = [ ]
            h = 0
            t = 1
            q.append ( 0 )
            while t != h :
                x = q [ h ]
                h += 1
                if h == len ( q ) : h = 0
                for i in range ( n - 1 ) :
                    y = x + b [ i ]
                    dd = 1
                    if y >= k :
                        y -= k
                        dd = 0
                    if ( d [ y ] == - 1 ) or ( d [ y ] > ( d [ x ] + dd ) ) :
                        d [ y ] = d [ x ] + dd
                        if dd == 0 :
                            h -= 1
                            if h < 0 : h += len ( q )
                            q.append ( y )
                        else :
                            q.append ( y )
                            t += 1
                            if t == len ( q ) : t = 0
            if d [ ( int ( l ) % k ) ] == - 1 : return 'IMPOSSIBLE'
            else : return ''
    return B ( )
