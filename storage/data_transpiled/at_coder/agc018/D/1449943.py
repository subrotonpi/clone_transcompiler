def _import ( ) : return sys.stdin
import io
import os
import sys
import os
import sys
import os.path
import shlex
import random
import random
import subprocess
import subprocess
import subprocess
import subprocess
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.stdin = subprocess.Popen ( self.stdin , bufsize = 32768 )
        self.stdout = subprocess.Popen ( self.stdout , bufsize = 32768 )
        self.stdin.readline ( )
        self.stdout.readline ( )
        self.stdin.close ( )
        self.stdout.close ( )
    def readline ( self ) :
        while not self.stdin.readline ( ) or not self.stdout.readline ( ) :
            try :
                self.stdin.readline ( )
            except EOFError :
                raise
        return self.stdin.readline ( )
    def readline ( self ) :
        return int ( self.stdin.readline ( ) )
    def readline ( self ) :
        return self.stdin.readline ( )
    def readline ( self ) :
        return int ( self.stdin.readline ( ) )
