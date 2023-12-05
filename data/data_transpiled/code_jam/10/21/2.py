def round1 ( ) :
    import os
    import sys
    import os
    import sys
    import os
    import sys
    import os
    import sys
    import sys
    import itertools
    class A ( object ) :
        def __init__ ( self ) :
            self.stdin = sys.stdin
            self.stdout = sys.stdout
            self.T = len ( self.stdin )
            for i in range ( T ) :
                self.stdout.write ( 'Case #%d: %s\n' % ( i + 1 , A ( ).solve ( self.stdin ) ) )
        def solve ( self , f ) :
            n = self.stdin.readline ( ).strip ( )
            m = self.stdin.readline ( ).strip ( )
            f.readline ( )
            dir = set ( )
            for i in range ( n ) :
                s = f.readline ( ).strip ( )
                dir.add ( s )
            st = len ( dir )
            for i in range ( m ) :
                s = f.readline ( ).strip ( )
                j = 0
                while ( s [ j ] == '/' ) :
                    j += 1
                dir.add ( s [ : j ] )
            return len ( dir ) - st
    return A ( )
