def import import os
import sys
import os
import subprocess
import subprocess
class Main ( subprocess.Popen ) :
    def communicate ( self ) :
        s = os.popen ( 'r' ).read ( )
        s = s.split ( '\n' )
        p = len ( s ) - len ( s.rstrip ( ) )
        m = len ( s ) - p
        print ( p - m )
