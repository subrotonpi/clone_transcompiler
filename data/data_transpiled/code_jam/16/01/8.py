def gcj2016.qualif ( ) :
    import os
    import sys
    import os
    import sys
    import os
    import sys
    import sys
    import os
    import sys
    import sys
    import os
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import tempfile
    import os
    import sys
    import os
    import sys
    import subprocess
    import subprocess
    import subprocess
    import sys
    import os
    import sys
    import os
    import tempfile
    from os import getcwd
    import os
    import subprocess
    from os import getcwd
    import subprocess
    from os import getcwd
    import os
    import sys
    base = '/home/jfortin/workspace-gcj/Codejam2016/q/ExoA/'
    input = os.path.join ( base , 'b1.in' )
    output = os.path.join ( base , 'b1.out' )
    try :
        sc = subprocess.Popen ( [ 'gensim' , '--' , '--' , '--' , '--' , '--' , '--' ] , stdin = subprocess.PIPE , stdout = subprocess.PIPE , stderr = subprocess.STDOUT , universal_newlines = True )
    except Exception :
        logging.getLogger ( 'ExoA' ).exception ( )
    else :
        n = len ( sc.stdout.read ( ) )
        sc.stdout.write ( '\n' )
        for c in range ( n ) :
            print ( 'Test case {}...'.format ( c + 1 ) , end = '' )
            print ( 'Case #{}: '.format ( c + 1 ) , end = '' )
            test ( sc , sys.stdout , sys.stdout , sys.stdout , sys.stderr )
            sys.stdout.write ( '\n' )
        print ( )
        sys.stdout.flush ( )
        os.chdir ( dirname )
