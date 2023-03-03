def import sys
import os
import sys
import os
import subprocess
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.stderr = sys.stderr
        self.n = self.stdin.read ( )
        if self.n >= 1 and self.n <= 999 :
            print ( "ABC" )
        elif self.n > 999 :
            print ( "ABD" )
