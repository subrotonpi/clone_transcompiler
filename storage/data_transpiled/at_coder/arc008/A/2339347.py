def import import sys
import os
import subprocess
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stdout = sys.stdout
        self.stderr = sys.stderr
        self.stdout.flush ( )
    def readline ( self ) :
        r = os.popen ( 'readline' , 'r' )
        n = int ( r.read ( ) )
        print ( n / 10 ** 100 + min ( n % 10 ** 15 , 100 ) )
