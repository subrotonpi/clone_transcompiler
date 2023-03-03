def import _open
import os
import sys
import os
import subprocess
import subprocess
import sys
class b :
    def __init__ ( self ) :
        self.stdin = open ( 'B-large.in' , 'r' )
        self.stdout = open ( 'b.out' , 'w' )
        self.cc = 0
        self.t = sys.stdin.read ( )
    def run ( self ) :
        while self.t :
            x = self.stdin.readline ( )
            for i in x :
                for j in range ( 0 , len ( x ) ) :
                    if x [ j ] > x [ j + 1 ] :
                        nx = x [ : j ]
                        nx = nx + chr ( x [ j ] - 1 )
                        while len ( nx ) < len ( x ) :
                            nx = nx + "9"
                        x = nx
            while len ( x ) > 1 and x [ 0 ] == '0' :
                x = x [ 1 : ]
            self.stdout.write ( 'Case #%d: %s\n' % ( self.cc ++ , x ) )
