def gcj2015.r1b ( ) :
    import os
    import sys
    import os
    import sys
    import os
    import sys
    import math
    import logging
    import os
    import sys
    import os
    import sys
    import os
    import sys
    import os
    import subprocess
    import tempfile
    import time
    import time
    import time
    import sys
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import sys
    import os
    import sys
    import os
    import sys
    import subprocess
    import sys
    import subprocess
    import sys
    import os
    import sys
    base = '/home/jean/gcj2015/1b/ExoC/'
    input = os.path.join ( base , 's1.in' )
    output = os.path.join ( base , 's1.out' )
    try :
        sc = subprocess.Popen ( [ sys.executable , '-c' , '-' , '-' , '-' ] , stdout = subprocess.PIPE , stderr = subprocess.STDOUT )
        n = sc.stdout.readline ( ).split ( ) [ 0 ]
        sc.stdout.write ( '\n' )
        for c in range ( n ) :
            print ( 'Test case %d...' % ( c + 1 ) )
            print ( 'Case #%d: ' % ( c + 1 ) , end = ' ' )
            test ( sc , sys.stdout )
            print ( )
        print ( )
        sys.stdout.flush ( )
        os.remove ( output )
        sys.exit ( 1 )
    except Exception :
        logging.getLogger ( 'ExoC' ).exception ( )
