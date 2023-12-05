def import import sys
import os
import sys
import subprocess
import subprocess
class Main ( subprocess.Popen ) :
    def communicate ( self ) :
        input = open ( self.logfile )
        line = input.readline ( )
        n = int ( line )
        print ( ( n % 2 == 0 ) )
