def _import ( ) : return
import math
import os
import sys
import os
import math
class box ( object ) :
    def __init__ ( self ) :
        self.a = [ 0 ]
        self.b = [ 0 ]
        self.n , self.m = 100 , 100
        self.dp = [ ]
        self.ZDEBUG = False
        def do_dp ( self , i , j ) :
            if i < 0 or j < 0 :
                return math.nan
            elif self.dp [ i ] [ j ] >= self.dp [ j ] :
                return self.dp [ i ] [ j ]
    def do_dp ( self , i , j ) :
        if i < 0 or j < 0 :
            return math.nan
        elif self.dp [ i ] [ j ] >= self.dp [ j ] :
            return self.dp [ i ] [ j ]
        m = do_dp ( self.n - 1 , j ).max ( do_dp ( self.n - 1 , j - 1 ) )
        if self.A [ i ] == self.B [ j ] :
            if self.ZDEBUG :
                print ( self.i , self.j )
            k , ii , jj = self.A [ i ] , self.i , self.j
            ci , cj , t = self.a [ ii ] , self.b [ jj ] , self.a [ jj ]
            m = m.max ( do_dp ( self.n - 1 , self.n - 1 ) + t )
            if self.ZDEBUG :
                print ( " " , self.ii , self.jj , " " , ci , " " , cj , " " , t , " " , m )
            if self.ci == 0 :
                if self.i == k :
                    ci = self.a [ ii ]
                if self.cj == 0 :
                    if self.j == k :
                        cj = self.b [ jj ]
            elif self.A [ ii ] != k :
                if self.j == k :
                    cj = self.a [ ii ]
return box
