def _import ( * os ) : return
import sys
import math
import numpy as np
import collections
import math
import sys
import sys
import sys
import os
import sys
import os
import sys
import gc
import gc
INF = 1 << 29
def run ( ) :
    with open ( '/proc/' , 'rb' ) as f :
        on = gc.collect ( )
        for o in range ( 1 , on + 1 ) :
            print ( "Case #%d: " % o , end = ' ' )
            n , m = struct.unpack ( '>I' , f.read ( INF ) )
            g = [ [ ] for _ in range ( n ) ]
            for i in range ( m ) :
                for j in range ( 1 , n ) :
                    g [ i ] [ j ] = struct.unpack ( '>I' , f.read ( INF ) )
            n2 = n // 2
            dp = [ [ ] for _ in range ( m + 1 ) ]
            for i in range ( m ) :
                for j in range ( 1 , n ) :
                    fill ( dp [ i ] [ j ] , - INF )
            for i in range ( 1 , n ) :
                dp [ 0 ] [ 0 ] [ i ] = i >> n2 & 1
            for i in range ( m ) :
                for j in range ( 1 , n ) :
                    for k in range ( 1 , n ) :
                        for h in range ( 1 , n ) :
                            ok = True
                            for a in range ( n ) and ok :
                                c = 0
                                for d in range ( max ( a - 1 , 0 ) , n ) :
                                    c += j >> d & 1
                                    c += k >> d & 1
                                    c += h >> d & 1
                                if c != g [ a ] [ i ] :
                                    ok = False
                            if ok :
                                dp [ i + 1 ] [ k ] = max ( dp [ i + 1 ] [ k ] , dp [ j ] [ k ] + ( h >> d ) & 1 )
