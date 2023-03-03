def _ import SPACETOKEN os.path
import os
import sys
import os
import subprocess
import os
import sys
import subprocess
import json
import json
import json
class Oppa ( subprocess ) :
    def main ( self ) :
        subprocess.call ( self.cmd )
    def get ( self , cur ) :
        try :
            self.run1 ( )
        except KeyboardInterrupt :
            pass
        return cur
    def run1 ( self ) :
        sc = subprocess.Popen ( [ 'bonus.in' , '--' , '--' ] , stdout = subprocess.PIPE )
        f = open ( 'bonus.out' , 'w' )
        T = sc.wait ( )
        for tn in range ( 1 , T + 1 ) :
            f.write ( 'Case #%d:\n' % tn )
            n = sc.wait ( )
            m = sc.wait ( )
            h = [ ]
            for i in range ( n ) :
                for j in range ( m ) :
                    h.append ( sc.read ( ) )
            next = [ ]
            for i in range ( n ) :
                for j in range ( m ) :
                    cur = [ i , j ]
                    for di in range ( - 1 , 2 ) :
                        for dj in range ( - 1 , 2 ) :
                            if di * di + dj * dj == 1 and i + di >= 0 and j + dj >= 0 and i + di < n and j + dj < m :
                                if h [ cur [ 0 ] ] [ cur [ 1 ] ] > h [ i + di ] [ j + dj ] :
                                    cur [ 0 ] = i + di
                                    cur [ 1 ] = j + dj
                        next.append ( cur )
                    for i in range ( n ) :
                        for j in range ( m ) :
                            next [ i ] [ j ] = get ( next [ i ] , next )
        return next
