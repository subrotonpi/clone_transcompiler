def _import ( ) : return _import ( )
import sys
import os
import sys
import tokenize
import tokenize
import tokenize
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.V , self.X = None , None
    def readline ( self ) :
        if self.C [ 0 ] == self.C [ 1 ] :
            return self.V / ( self.R [ 0 ] + self.R [ 1 ] )
        self.X *= self.V
        for i in range ( self.N ) :
            self.C [ i ] *= self.R [ i ]
        b = ( self.X * self.R [ 0 ] / self.C [ 0 ] - self.V ) / ( self.C [ 1 ] * self.R [ 0 ] / self.C [ 0 ] - self.R [ 1 ] )
        a = ( self.V - b * self.R [ 1 ] ) / self.R [ 0 ]
        return max ( a , b )
    def main ( self ) :
        scan = tokenize
        task_count = scan.next ( )
        for task_index in range ( 1 , task_count + 1 ) :
            N , V , X , R , C = scan ( )
            res = None
            if N == 1 :
                if self.C [ 0 ] == X :
                    res = self.V / R [ 0 ]
                else :
                    print ( 'Case #%d: IMPOSSIBLE' % task_index )
                    continue
            else :
                if ( self.C [ 0 ] > self.X and self.C [ 1 ] > self.X ) or ( self.C [ 0 ] < self.X and self.C [ 1 ] < self.X ) :
                    print ( 'Case #%d: IMPOSSIBLE' % task_index )
                    continue
                else :
                    res = self.cal ( )
            print ( 'Case #%d: %.8f' % ( task_index , res ) )
