def import gcj
import gc
import numpy
import gc
import os
import sys
class Osmos ( ) :
    def __init__ ( self ) :
        self.s = gc.create_file ( 'A' , mode = 'r' )
        self.T = len ( self.s )
for i in range ( 1 , T + 1 ) :
    size = s.size
    N = s.size
    m = [ s.size for s in range ( N ) ]
    m.sort ( )
    min = N
    if size > 1 :
        cnt = 0
        for j in range ( N ) :
            while size <= m [ j ] :
                cnt += 1
                size += size - 1
            size += m [ j ]
            min = min ( min , cnt + N - j - 1 )
        gc.collect ( )
