def gcj ( ) :
    import os
    import sys
    import random
    import sys
    import os
    import sys
    import random
    import string
    import string
    import string
    import random
    import string
    import string
    import sys
    import os
    import subprocess
    import subprocess
    import tempfile
    import os
    import sys
    import subprocess
    import tempfile
    import os
    import tempfile
    import os
    import tempfile
    import os
    import tempfile
    import os
    import tempfile
    from os.path import join
    from os import getcwd
    from os import chdir
    from os import getcwd
    from os import chdir
    from random import randint
    from random import random
    def preprocess ( ) :
        global N
        global edg
        global edg
        global flag
        global visited
        def dfs ( pos ) :
            visited [ pos ] = True
            for next in edg [ pos ] :
                if next in visited :
                    flag = True
                else :
                    dfs ( next )
        return [ ]
    def solve ( sc , f ) :
        edg = [ ]
        N = randint ( 1 , N )
        for i in range ( N ) :
            cnt = randint ( 1 , N )
            edg.append ( [ ] )
            for j in range ( cnt ) :
                edg [ i ].append ( random.randint ( 1 , N - 1 ) )
        visited = [ False ] * N
        flag = False
        for i in range ( N ) :
            [ visited [ i ] ] = False
            dfs ( i )
        f.write ( 'Yes' if flag else 'No' )
    def main ( ) :
        preprocess ( )
        sc = open ( os.path.join ( WORK_DIR , 'input.txt' ) , 'r' )
        f = open ( os.path.join ( WORK_DIR , 'output.txt' ) , 'w' )
        casecnt = randint ( 1 , N )
        for casenum in range ( casecnt ) :
            print ( 'Processing test case %d' % ( casenum + 1 ) , end = '' )
            f.write ( 'Case #%d: ' % ( casenum + 1 ) )
            subprocess.call ( solve , shell = True )
        f.flush ( )
        f.close ( )
    return main