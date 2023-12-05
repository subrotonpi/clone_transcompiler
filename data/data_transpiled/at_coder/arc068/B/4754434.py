def _import ( ) : return sys.stdin
import io
import os
import os
import sys
import os
import sys
import os.linesep
import sys
import io
import codecs
import os.environ [ 'GBK' ]
import os
import sys
import os.environ [ 'GBK' ]
import os
import sys
import os.environ [ 'GBK' ]
import os
import sys
import shlex
import sys
import subprocess
import subprocess
import shlex
import shlex
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.stdin = LightScanner ( self.stdin )
        self.stdout = LightWriter ( self.stdout )
        self.stdin = shlex.shlex ( shlex.split ( self.stdin ) )
        self.stdout = sys.stdout
        self.stdin.readline ( )
        self.stdout.readline ( )
        self.stdin.close ( )
        self.stdout = sys.stdin
        self.stdout.close ( )
    def ints ( self ) : return int ( self.stdin.readline ( ) )
