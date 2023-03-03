def import _Point
import Queue
import sys
import os
import sys
class Main ( object ) :
    INF = 10000
    def __init__ ( self ) :
        self.INF = 10000
    def __call__ ( self , * args ) :
        sc = os.popen ( "/usr/bin/sh -v --no-color" )
        self.que = Queue.Queue ( )
        dx = [ 1 , 0 , - 1 , 0 ]
        dy = [ 0 , 1 , 0 , - 1 ]
        h , w , sx , sy , gx , gy = self.raw_input ( )
        f = [ ]
        dist = [ [ INF for i in range ( h ) ] for j in range ( w ) ]
        for i in range ( h ) :
            f.append ( sc.read ( ).decode ( 'utf-8' ) )
        start = ( sx , sy )
        dist [ sx ] [ sy ] = 0
        self.que.put ( start )
        while not self.que.empty ( ) :
            p = self.que.get ( )
            if p [ 0 ] == gx and p [ 1 ] == gy :
                break
            for i in range ( 4 ) :
                nx = p [ 0 ] + dx [ i ]
                ny = p [ 1 ] + dy [ i ]
                if f [ nx ] [ ny ] == '.' and dist [ nx ] [ ny ] == INF :
                    self.que.put ( ( nx , ny ) )
                    dist [ nx ] [ ny ] = dist [ p [ 0 ] ] [ p [ 1 ] ] + 1
        print ( dist [ gx ] [ gy ] )
