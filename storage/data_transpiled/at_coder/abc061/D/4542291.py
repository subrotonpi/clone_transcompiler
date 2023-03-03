def import import _sys , bellman_ford
import os
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.m = 0
        self.e = [ ]
        self.dis = [ ]
        inf = 1000000000000000l
    def main ( self ) :
        sc = open ( "/proc/" , "r" )
        self.n = sc.n
        self.m = sc.m
        self.e = [ ]
        self.dis = [ inf ]
        self.dis.append ( 0 )
        for a , b , c in [ ( a - 1 , b - 1 , - c ) for a , b , c in [ ( a - 1 , b - 1 , c ) for b , c in [ ( b - 1 , c ) for c in [ ( c - 1 , c ) for c in [ ( c - 1 , c ) for c in [ ( c , 0 ) for c in [ 1 , 1 ] ] ] ] ] :
            e.append ( ( a - 1 , b - 1 , - c ) )
    def bellman_ford ( self ) :
        for i in range ( self.n + 1 ) :
            for j in range ( self.m ) :
                if self.dis [ e [ j ].from_from ] != inf and self.dis [ e [ j ].to_from ] > self.dis [ e [ j ].from_from ] + e [ j ].cost :
                    self.dis [ e [ j ].to_from ] = self.dis [ e [ j ].from_from ] + e [ j ].cost
                    if i == self.n and self.dis [ e [ j ].to_from ] == self.n - 1 :
                        return True
        return False
class Edge ( object ) :
    def __init__ ( self ) :
        self.from = self.to = self.cost = 0
