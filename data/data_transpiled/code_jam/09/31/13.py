def googlejam ( ) :
    import os
    import sys
    import os
    import sys
    import os
    import sys
    import os.path
    import sys
    import os.path
    import sys
    import os.path
    import sys
    import subprocess
    import subprocess
    class AllYourBase ( object ) :
        def __init__ ( self ) :
            self.stdin = open ( 'C:\\A-large.in.txt' )
            self.pr = open ( 'C:\\Alargeout.txt' , 'w' )
            self.T = int ( self.stdin.readline ( ).strip ( ) )
            for i in range ( self.T ) :
                temp = self.stdin.readline ( ).strip ( )
                no = self.cal ( temp )
                self.pr.write ( 'Case #%d: %d\n' % ( self.i + 1 , no ) )
    def cal ( temp ) :
        m = { }
        max = 0
        s = [ 1 ]
        m [ temp [ 0 ] + '' ] = 1
        for char in temp [ 1 : ] :
            if char in m : s.append ( m [ char ] + '' )
            else :
                m [ char ] = max
                s.append ( m [ char ] + '' )
                max += 1
            if max == 1 : max += 1
    base = max
    if base < 2 : base = 2
    result = 0
    for i in range ( len ( s ) ) :
        sys.stdout.write ( s [ i ] )
        result = result * base + s [ i ]
    sys.stdout.write ( '\n' )
    return result
