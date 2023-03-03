def _import ( ) : return sys.stdin.read ( )
import os
import sys
import os
import sys
import time
class Main ( ) :
    def __init__ ( self , N , M , T ) :
        self.N = N
        self.M = M
        self.T = N
        self.c = 0
        self.c = 0
    def next_long_array ( self , n ) :
        a = [ ]
        for i in range ( n ) :
            a.append ( randint ( 0 , i ) )
        return a
    def next_long_array ( self , n ) :
        self.a = [ ]
        for i in range ( n ) :
            a.append ( randint ( 0 , i ) )
        return a
    def solve ( self ) :
        forward = self.dijk ( False )
        back = self.dijk ( True )
        ans = long ( self.A [ 0 ] * self.T )
        for i in range ( 1 , N ) :
            if forward [ i ] == INF or back [ i ] == INF : continue
            t = T - forward [ i ] - back [ i ]
            if t <= 0 : continue
            ans = max ( t * A [ i ] , ans )
        return ans
    def dijk ( reverse = False ) :
        G = self.adjd ( N , E , reverse = reverse )
        q = [ ]
        cost = [ 0 ] * N
        cost.append ( INF )
        while not q.empty ( ) :
            s = q.pop ( )
            if cost [ s.a ] != s.c : continue
            for edge in G [ s.a ] :
                next = edge [ 0 ]
                next_cost = s.c + edge [ 1 ]
                if cost [ next ] > next_cost :
                    q.append ( ( next , next_cost ) )
                    cost [ next ] = next_cost
        return cost
