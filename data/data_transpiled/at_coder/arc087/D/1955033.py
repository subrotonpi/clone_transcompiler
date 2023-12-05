def _main ( ) : return
import os
import sys
import getopt
import getopt
import os
import time
import time
MOD = 1_000_000_000 + 7
MAX = 10000
fac = [ 0 ] * MAX
ifac = [ 0 ] * MAX
inv = [ 0 ] * MAX
def _tr ( * objects ) :
    print ( [ o for o in objects if o [ 0 ] == o [ 1 ] ] )
def _tr ( * args ) :
    with open ( os.devnull , 'w' ) as devnull :
        os.dup2 ( devnull.fileno ( ) , sys.stdin.fileno ( ) )
def _tr ( * args ) :
    os.dup2 ( args [ 0 ] , sys.stdin.fileno ( ) )
    os.dup2 ( args [ 1 ] , sys.stdin.fileno ( ) )
    os.dup2 ( args [ 2 ] , sys.stdin.fileno ( ) )
def _tr ( * args ) :
    os.dup2 ( args [ 1 ] , sys.stdin.fileno ( ) )
    os.dup2 ( args [ 2 ] , sys.stdin.fileno ( ) )
def _tr ( * args ) :
    os.dup2 ( args [ 3 ] , sys.stdin.fileno ( ) )
def _tr ( * args ) :
    os.dup2 ( args [ 4 ] , sys.stdin.fileno ( ) )
def _tr ( * args ) :
    os.dup2 ( args [ 4 ] , sys.stdin.fileno ( ) )
def _tr ( * args ) :
    os.dup2 ( args [ 4 ] , sys.stdin.fileno ( ) )
def _tr ( * args ) :
    os.dup2 ( args [ 4 ] , sys.stdin.fileno ( ) )
n = _tr ( n )
g = [ [ ] for _ in range ( n ) ]
for i in range ( n ) :
    g [ i ] = _tr ( * args )
for i in range ( n - 1 ) :
    v = _tr ( * args )
    g [ i ].append ( v )
for i in range ( n ) :
    _tr ( * args )
    