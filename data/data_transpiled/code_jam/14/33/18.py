def at.jaki.round1C ( ) :
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
    import sys
    import os
    import sys
    import os
    import subprocess
    import subprocess
    import subprocess
    import sys
    from os.path import join
    from os import getcwd
    from os.path import join
    INPUT = 'C-small-attempt0.in'
    OUTPUT = 'C-small-attempt0.out'
    total_tests = int ( os.path.join ( getcwd , 'C-small-attempt0.in' ) )
    for test_no in range ( 1 , total_tests + 1 ) :
        temp = subprocess.check_output ( [ 'C' , '--' , INPUT , '--' , OUTPUT , '--' ] ).split ( )
        n = int ( temp [ 0 ] )
        m = int ( temp [ 1 ] )
        k = int ( temp [ 2 ] )
        result = ''.join ( [ str ( x ) for x in solve ( n , m , k ) ] )
        print ( 'Case #%d: ' % test_no , end = ' ' )
        print ( result , file = sys.stdout )
        print ( result , file = sys.stdout )
    sys.stdout.flush ( )
    subprocess.call ( [ 'C' , '--' , OUTPUT , '--' ] )
