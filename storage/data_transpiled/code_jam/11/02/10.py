def import _makenewicka
import sys
import os
import subprocess
import subprocess
import subprocess
import subprocess
import sys
class Magicka :
    def __init__ ( self ) :
        self.stdin = open ( 'B-large.in' , 'r' )
        self.T = int ( subprocess.Popen ( [ 'b' , '--' , '-' ] , stdout = subprocess.PIPE ).communicate ( ) [ 0 ].decode ( 'utf-8' ) )
        self.stdin.close ( )
        self.stdout = open ( 'output' , 'w' )
        self.basemap = { 'Q' : 0 , 'W' : 1 , 'E' : 2 , 'R' : 3 , 'A' : 4 , 'S' : 5 , 'D' : 6 , 'F' : 7 }
        for I in range ( 1 , T + 1 ) :
            line = subprocess.Popen ( [ 'b' , '-' , '-' ] , stdin = subprocess.PIPE , stdout = subprocess.PIPE ).communicate ( )
            C = int ( line [ 0 ] )
            self.combo = [ [ ] for _ in range ( 8 ) ]
            self.combo = [ [ ] for _ in range ( C ) ]
            self.opposed = [ [ ] for _ in range ( 8 ) ]
            self.D = int ( line [ 0 ] )
            for _ in range ( D ) :
                arr = line [ 0 ]
                self.opposed [ arr [ 0 ] ] [ arr [ 1 ] ] = arr [ 2 ]
                self.opposed [ arr [ 1 ] ] [ arr [ 0 ] ] = arr [ 2 ]
            self.stack = [ ]
            self.process = subprocess.Popen ( [ 'b' , '-' , '-' ] , stdin = subprocess.PIPE , stdout = subprocess.PIPE ).communicate ( ) [ 0 ]
            self.recID = - 1
            self.killSwitch = [ ]
