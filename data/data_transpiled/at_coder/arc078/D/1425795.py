def _main ( ) : return
import os
import sys
import os
import sys
import itertools
import itertools
import itertools
import os
import subprocess
import subprocess
import subprocess
import subprocess
import subprocess
import sys
class Main ( subprocess ) :
    def raw_input ( self ) :
        fh = sys.stdin
        fh = sys.stdout
        stdout = subprocess.PIPE
        stdin = open ( fh )
        stdout = open ( fh , 'w' )
        stdout = open ( stdout , 'w' )
        solver = subprocess.Popen ( [ 'taskf' , '--' , '--' ] , stdin = stdin , stdout = stdout )
        stdout.write ( stdout.read ( ) )
        stdout.close ( )
    def raw_input ( self ) :
        try :
            rl = subprocess.Popen ( [ 'taskf' , '--' ] , stdin = stdout , stdout = subprocess.PIPE )
        except OSError :
            raise
        else :
            rl = subprocess.Popen ( [ 'taskf' , '--' ] , stdin = stdin , stdout = stdout )
            stdout.write ( stdout.read ( ) )
    def solve ( self , test_number , stdin = None , stdout = None ) :
        n = len ( stdin )
        m = len ( stdin )
        edge_cost = [ [ ] for _ in range ( n ) ]
        for arr in edge_cost :
            [ arr [ 0 ] for _ in range ( m ) ]
        total_cost = 0
        for a , b , c in zip ( stdin , stdout ) :
            edge_cost [ a ] [ b ] = c
            edge_cost [ b ] [ a ] = c
            total_cost += c
    comp_cost = [ 0 ] * ( 1 << n )
    for mask in itertools.product ( * [ [ 1 ] for _ in range ( n ) ] ) :
        for root in range ( n ) :
            if mask & ( 1 << root ) :
                continue
            for j in range ( i + 1 ) :
                if mask & ( 1 << j ) :
                    comp_cost [ mask ] += edge_cost [ i ] [ j ]
    d = [ ]
    for arr in itertools.product ( * [ [ 1 ] for _ in range ( n ) ] ) :
    INDENT