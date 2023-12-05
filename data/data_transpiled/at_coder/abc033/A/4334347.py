def import import os
import sys
import os
import subprocess
import subprocess
import time
class Main ( subprocess.Popen ) :
    def communicate ( self ) :
        f = open ( self.cmd )
        k = len ( [ x for x in f.readlines ( ) if x.strip ( ) ] )
        f.close ( )
        if k == 1 :
            print ( 'SAME' )
        else :
            print ( 'DIFFERENT' )
