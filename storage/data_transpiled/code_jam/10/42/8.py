def _import ( ) : return sys._getframe ( ).f_code.co_name
import time
import sys
import os
import time
import sys
import os
import subprocess
import subprocess
import subprocess
import tempfile
import time
import random
import sys
start_time = time.clock ( )
tc = randint ( )
for cn in range ( tc ) :
    p = randint ( 1 , p )
    n = 1 << p
    most = [ random.randrange ( 1 , p ) for i in range ( n ) ]
    c = [ [ random.randrange ( 1 , p ) for i in range ( n ) ] for j in range ( 1 << ( p - i - 1 ) ) ]
    f = [ [ 0 ] * p + [ 1 ] * n for i in range ( p + 1 ) ]
    inf = 1000000000000L
    for i in range ( p ) :
        for j in range ( 1 << ( p - i - 1 ) ) :
            for x in range ( 0 , p ) :
                if i == 0 :
                    y = min ( most [ 2 * j ] , most [ 2 * j + 1 ] )
                    f [ x ] [ i ] [ j ] = 0 if x < y else inf
                elif x < p :
                    a = f [ x + 1 ] [ i - 1 ] [ 2 * j ] + f [ x + 1 ] [ i - 1 ] [ 2 * j + 1 ]
                    b = f [ x ] [ i - 1 ] [ 2 * j ] + f [ x ] [ i - 1 ] [ 2 * j + 1 ] + c [ i ] [ j ]
                    f [ x ] [ i ] [ j ] = min ( a , b )
    print ( "Case #%d: %s" % ( cn + 1 , f [ 0 ] [ p - 1 ] [ 0 ] ) )
