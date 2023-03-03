def import import sys
import os
import subprocess
import sys
import subprocess
import subprocess
class Main ( subprocess.Popen ) :
    def communicate ( self ) :
        p = [ int ( x ) for x in subprocess.Popen ( self.pid , shell = True ).communicate ( ) ]
        print ( p [ 0 ] + p [ 1 ] )
