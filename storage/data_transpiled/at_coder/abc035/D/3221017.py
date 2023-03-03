def _import ( ) : return _import ( )
import sys
import os
import sys
import os
import sys
import getopt
class Main :
    def __init__ ( self , x , M , T ) :
        self.x = x
        self.y = y
        self.c = self.x
    def __init__ ( self , x , y ) :
        self.x = x
        self.y = y
        self.c = self.y
    def __init__ ( self , x , y ) :
        self.x = x
        self.y = y
        self.c = self.x
    def __call__ ( self , o ) :
        return int ( self.x )
    def __next__ ( self ) :
        return next ( self.x )
    def __call__ ( self , o ) :
        return int ( self.y )
    def __next__ ( self ) :
        return next ( self.x )
    def __next__ ( self ) :
        return next ( self.y )
    def __eq__ ( self , o ) :
        return self.x == o
    def __next__ ( self ) :
        return next ( self.y )
    def __next__ ( self ) :
        return next ( self.x )
    def __next__ ( self ) :
        return next ( self.y )
    def solve ( self ) :
        forward = self.dijk ( False )
        back = self.dijk ( True )
        ans = long ( self.A [ 0 ] * self.T )
        for i in range ( 1 , N ) :
            if self.forward [ i ] == INF or self.back [ i ] == INF : continue
            t = self.T - self.forward [ i ] - self.back [ i ]
            if t <= 0 : continue
            ans = max ( t * self.A [ i ] , ans )
        return ans
    def dijk ( reverse ) :
        G = self.adjlist_d ( N , E , reverse )
        q = [ ]
        cost = [ 0 ] * self.INF
        cost.append ( 0 )
        q.append ( ( 0 , 0 ) )
        while not q.empty ( ) :
            s = q.pop ( )
            if cost [ s.a ] != s.