def gcj2015.r1
import os
import sys
import os
import math
import os
import os
import os
import sys
import os
import subprocess
import tempfile
import time
import time
import subprocess
import subprocess
import subprocess
import tempfile
import os
import tempfile
import os
import tempfile
import os
import subprocess
import tempfile
import tempfile
import time
class LoggingLarge ( tempfile ) :
    def __init__ ( self ) :
        self.name = 'gcj2015/r1/C-large'
        s = subprocess.Popen ( [ 'gg2015/r1/C-large' , '--' ] , stdout = subprocess.PIPE )
        self.count = s.stdout.count ( )
        self.out = tempfile.TemporaryFile ( )
        self.service = subprocess.Pool ( )
        futures = [ ]
        for cc in range ( 1 , count + 1 ) :
            n = s.stdout.count ( )
            x = [ ]
            y = [ ]
            for i in range ( n ) :
                x.append ( s.stdout.read ( ) )
                y.append ( s.stdout.read ( ) )
            futures.append ( self.service.submit ( self.solver , n , x , y ) )
        for cc in range ( 1 , count + 1 ) :
            self.out.write ( 'Case #%d: ' % cc )
            self.out.write ( '\n' )
            res = futures [ cc - 1 ].get ( )
            for r in res :
                self.out.write ( r )
    os.remove ( tempfile.mkdtemp ( ) )
