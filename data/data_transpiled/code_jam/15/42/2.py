def _import ( ) : return
import random
import sys
import os
import sys
import time
import sys
class B ( object ) :
    INF = 1e10
    def _solve_test ( self ) :
        n = randint ( 0 , n )
        v = float ( next ( self ) )
        x = float ( next ( self ) )
        pipes = [ ( float ( x ) , float ( x ) - x ) for x in self.read ( ).split ( ) ]
        pipes.sort ( key = lambda x : - float ( x [ 0 ] ) )
        l = r = INF
        while True :
            m = ( l + r ) / 2
            if m == l or m == r : break
            if can ( pipes , m , v ) :
                r = m
            else :
                l = m
        if r == INF : return "IMPOSSIBLE"
        else : return "%d" % r
    def can ( pipes , t , v ) :
        max = min = 0
        for pipe in pipes :
            if pipe.c > 0 :
                max += pipe.c * pipe.r * t
            else :
                min += pipe.c * pipe.r * t
        vv = qq = 0
        for pipe in pipes :
            if pipe.c == 0 :
                vv += pipe.r * t
            else :
                if pipe.c > 0 :
                    max -= pipe.c * pipe.r * t
                    tt = min ( t , - ( min + qq ) / ( pipe.c * pipe.r ) )
                    qq += tt * pipe.c * pipe.r
                    vv += tt * pipe.r
                else :
                    min -= pipe.c * pipe.r * t
                    tt = min ( t , - ( max + qq ) / ( pipe.c * pipe.r ) )
                    qq += tt * pipe.c * pipe.r
                    vv += tt * pipe.r
        return vv
