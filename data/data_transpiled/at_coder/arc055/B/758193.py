def _import ( ) : return ''
import sys
import os
import sys
import os
import sys
import struct
import random
class Main ( object ) :
    def __init__ ( self ) :
        self.N , self.K = 0 , 0
        self.dp = [ ]
    def dfs ( self , n , k ) :
        if k == 0 :
            return 0.0
        elif k >= self.N - n + 1 :
            return 1.0
        if self.dp [ n ] [ k ] != - 1 :
            return self.dp [ n ] [ k ]
    def dfs ( self , n , k ) :
        if k == 0 :
            raise StopIteration ( )
        self.dp = [ ]
    def dfs ( self , n , k ) :
        if k == 1 :
            return int ( self.dp [ n ] )
        elif k >= n + 1 :
            return long ( self.dp [ n ] [ k ] )
        elif k == k :
            return float ( self.dp [ n ] [ k ] )
    def dfs ( self , n , k ) :
        if k == 1 :
            return int ( self.dp [ n ] )
        return int ( self.dp [ n ] )
    def dfs ( self , n , k ) :
        return int ( self.dp [ n ] )
    def dfs ( self , n , k ) :
        if k == 0 :
            return 0.0
        elif k >= self.N - n + 1 :
            return 1.0
        if self.dp [ n ] [ k ] != - 1 :
            return self.dp [ n ] [ k ]
    NSenbei = 1.0 / ( self.N - n + 1 )
    not_NSenbei = ( 1.0 - NSenbei )
    max_senbei = 1.0 / self.n
    not_NMaxSenbei = not_NSenbei * max_senbei
    eat = dfs ( self , n + 1 , k - 1 ) * not_NMaxSenbei + NSenbei
    not_NMaxSenbei = 1.0 - max_senbei
    not_NNotMaxSenbei = not_NNotMaxSenbei * not_NMaxSenbei
    return self