def import _solve
import sys
import random
class Main ( object ) :
    def __init__ ( self ) :
        self.N = random.randint ( 0 , M )
        self.M = random.randint ( 0 , M )
        self.E = [ ( self.N - 1 , self.M - 1 , self.N ) for self in range ( M ) ]
        print ( self.solve ( ) )
    def solve ( self ) :
        dist = [ ]
        for x in self.dist :
            [ x ] = INF
        for edge in self.E :
            dist [ edge.a ] [ edge.b ] = edge.cost
            dist [ edge.b ] [ edge.a ] = edge.cost
        for k in range ( self.N ) :
            for i in range ( self.N ) :
                if dist [ i ] [ k ] == INF : continue
                for j in range ( self.N ) :
                    if dist [ k ] [ j ] == INF : continue
                    if dist [ i ] [ k ] + dist [ k ] [ j ] < dist [ i ] [ j ] :
                        dist [ i ] [ j ] = dist [ i ] [ k ] + dist [ k ] [ j ]
        ans = 0
        for edge in self.E :
            if dist [ edge.a ] [ edge.b ] < edge.cost : ans += 1
        return ans
