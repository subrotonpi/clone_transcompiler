def _import ( ) : return [ ]
import math
import os
import time
import math
import os
import math
class Main ( object ) :
    def __init__ ( self , n ) :
        self.n = n
        self.c = c
        self.x = [ ]
        self.v = [ ]
        self.lc = [ ]
        self.rc = [ ]
        self.lc_max = [ ]
        self.rc_max = [ ]
        for i in range ( n ) :
            self.x.append ( self.x [ i ] )
            self.v.append ( self.v [ i ] )
        for i in range ( n ) :
            self.lc [ i + 1 ] = self.lc [ i ] + self.v [ i ]
        for i in range ( n ) :
            self.lc [ i + 1 ] -= self.x [ i ]
        for i in range ( n ) :
            self.rc [ i + 1 ] = self.rc [ i ] + self.v [ n - 1 - i ]
        for i in range ( n ) :
            self.rc [ i + 1 ] -= self.r_x [ i ]
        for i in range ( n ) :
            self.lc_max [ i + 1 ] = max ( self.lc_max [ i ] , self.lc [ i + 1 ] - self.x [ i ] )
        for i in range ( n ) :
            self.rc_max [ i + 1 ] = max ( self.rc_max [ i ] , self.rc [ i + 1 ] - self.r_x [ i ] )
    ret = [ 0l ]
    for i in range ( n ) :
        score = self.lc [ i + 1 ]
        ret.append ( score )
        score += self.rc_max [ n - i - 1 ]
        ret.append ( score )
    return ret
