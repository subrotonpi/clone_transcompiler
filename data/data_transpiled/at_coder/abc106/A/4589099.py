def import import sys
import os
import sys
import os
import subprocess
class Main ( object ) :
    def __init__ ( self ) :
        self.stdout = sys.stdout
        self.stderr = sys.stderr
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        print ( ( a - 1 ) * ( b - 1 ) )
