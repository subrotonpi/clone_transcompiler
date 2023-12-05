def _ import _ , SPACETOKEN os.write ( '...' , SPACETOKEN open ( '..' , SPACETOKEN 'r' ).read ( ) ) : return ''
import sys , random
import os
import string
import sys
import os
import subprocess
import subprocess
import shlex
class Main ( subprocess ) :
    def run ( self ) :
        subprocess.call ( self.cmd )
input_file = 'input/A-large.in'
output_file = 'output.txt'
global stdin , stdout
stdin = open ( input_file , 'r' )
stdout = open ( output_file , 'w' )
for case , test_count in enumerate ( [ 1 , 2 , 3 , 4 , 5 ] ) :
    solve ( case )
stdout.close ( )
if sys.version_info [ 0 ] < 3 :
    N = int ( sys.stdin.readline ( ) )
    M = int ( sys.stdin.readline ( ) )
    map = [ [ ] for _ in range ( N ) ]
    lp = lambda : [ ]
    for _ in range ( N ) :
        for i in range ( N + 1 ) :
            for j in range ( M + 1 ) :
                if map [ i ] [ j ] == '#' :
                    if replace ( i , j ) :
                        continue lp
                    else :
                        break lp
            break
    ok = True
    for i in range ( N ) :
        for j in range ( M ) :
            if map [ i ] [ j ] == '#' :
                ok = False
        stdout.write ( 'Case #%d:\n' % case )
        if ok :
            for s in map :
                stdout.write ( s )
        else :
            stdout.write ( 'Impossible\n' )
    replace ( i , j )
    if sys.version_info [ 0 ] < 3 :
        return ''
    else :
        return ''
