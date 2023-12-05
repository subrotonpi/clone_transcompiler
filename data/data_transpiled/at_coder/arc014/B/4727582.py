def _ ( ) : return sys.stdin.read ( )
import os
import sys
import os
import subprocess
import shlex
import subprocess
class Main ( object ) :
    sc = subprocess.Popen ( [ '/usr/bin/open' , '-w' ] , stdin = subprocess.PIPE , stdout = subprocess.PIPE , stderr = subprocess.PIPE )
    N = sc.wait ( )
    siri = { }
    data = [ ]
    for i in range ( N ) :
        if i == 0 :
            data.append ( sc.poll ( ) )
            siri [ data [ i ] ] = 1
        else :
            data.append ( sc.poll ( ) )
            if data [ i ] [ 0 ] != data [ i - 1 ] [ - 1 ] :
                if i % 2 == 0 :
                    pl ( 'LOSE' )
                    sys.exit ( )
                elif i % 2 == 1 :
                    pl ( 'WIN' )
                    sys.exit ( )
            else :
                if data [ i ] in siri :
                    if i % 2 == 0 :
                        pl ( 'LOSE' )
                        sys.exit ( )
                    elif i % 2 == 1 :
                        pl ( 'WIN' )
                        sys.exit ( )
                else :
                    siri [ data [ i ] ] = 1
    pl ( 'DRAW' )
class SC ( object ) :
    def __init__ ( self , stdin = None , stdout = None , stderr = None ) :
        self.stdin = stdin
        self.stdout = stdout
        self.stderr = stderr
        self.stdout = stdout
        self.stdin.readline ( )
        self.stdout.readline ( )
        self.stderr.readline ( )
        self.stdout.readline ( )
        self.stdout.readline ( )
        self.stderr.readline ( )
        self.stdout.readline ( )
    def __call__ ( self , x ) :
        print ( x )
