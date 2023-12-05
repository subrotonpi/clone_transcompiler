def import import sys , out
import getopt
from time import time
try :
    from getopt import getopt as f
except ImportError :
    print ( "Please install the python documentation for this tool." )
    sys.exit ( 1 )
n , k = len ( sys.argv ) , len ( sys.argv )
r = 0
t = [ ]
for o in range ( 1 , n + 1 ) :
    t.append ( o )
for i in range ( 1 , n + 1 ) :
    r += t [ i ]
    if i < 3 :
        continue
    if r < k :
        out.write ( sys.argv [ i ] )
        exit ( 0 )
    r -= t [ i - 2 ]
out.write ( - 1 )
