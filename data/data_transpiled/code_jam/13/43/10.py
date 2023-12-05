def contest ( ) :
    import os
    import sys
    import math
    import os
    import os
    import os
    import sys
    import os
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    class ErdosSzekeres :
        PROBLEM_NAME = 'erdos'
        WORK_DIR = r' D : \ Gcj\% s\ \' % PROBLEM_NAME
        def solve ( sc , file ) :
            N = os.stat ( 'input.txt' ).st_size
            A = [ ]
            B = [ ]
            for i in range ( N ) :
                A.append ( sc.randint ( 0 , N ) )
            for i in range ( N ) :
                B.append ( sc.randint ( 0 , N ) )
            less = [ [ ] for i in range ( N ) ]
            for i in range ( N ) :
                if A [ i ] >= A [ j ] :
                    less [ j ].append ( True )
            for i in range ( N ) :
                if A [ i ] > 1 :
                    j = i - 1
                    while A [ j ] != A [ i ] - 1 :
                        j -= 1
                    less [ j ].append ( True )
            for i in range ( N ) :
                if B [ i ] <= B [ j ] :
                    less [ i ].append ( True )
            for i in range ( N ) :
                if B [ i ] > 1 :
                    j = i + 1
                    while B [ j ] != B [ i ] - 1 :
                        j += 1
                    less [ j ].append ( True )
            deg = [ ]
            for i in range ( N ) :
                if less [ i ] : deg.append ( i )
            ans = [ ]
            for pp in deg :
                ans.append ( pp )
            for i in range ( N ) :
                ans.append ( i )
            ans.append ( ans )
    subprocess.call ( [ 'erdosSzekeres' , '---' , '---' , '--' , '--' , '--' ] )
