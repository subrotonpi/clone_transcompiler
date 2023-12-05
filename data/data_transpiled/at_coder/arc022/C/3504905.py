def _import ( ) : return _import ( )
import sys
import os
import sys
import time
import deque
import random
import string
import string
import random
import sys
class Main ( ) :
    def __init__ ( self ) :
        self.N = - 1
        self.A = random.randint ( 0 , N )
        self.B = random.randint ( 0 , N )
    def readline ( ) :
        if not sys.stdin.isatty ( ) or not sys.stdin.isatty ( ) :
            try :
                return sys.stdin.readline ( )
            except :
                raise
        return string.atoi ( readline ( ) )
    def solve ( self ) :
        G = self.adjB ( N , A , B )
        dia = self.diameter ( N , G )
        return ( dia [ 'a' ] + 1 , dia [ 'b' ] + 1 )
    def diameter ( self , N , G ) :
        adj = [ ]
        cnt = [ ]
        for f in self.from_ :
            cnt.append ( 1 )
        for t in self.to_ :
            cnt.append ( 1 )
        for f in self.to_ :
            adj.append ( [ 0 ] * cnt [ f ] )
        for f in self.to_ :
            adj [ f ] [ - 1 ] = self.to_ [ f ]
        return adj
    def diameter ( self , N , G ) :
        u = self.max_distance ( 0 , N , G )
        return self.max_distance ( u [ 'b' ] , N , G )
    def max_distance ( self , a , N , G ) :
        q = deque ( )
        dist = [ ]
        q.append ( [ - 1 ] * N )
        dist.append ( [ a , 0 ] )
        return self.max_distance ( a , N , G )
