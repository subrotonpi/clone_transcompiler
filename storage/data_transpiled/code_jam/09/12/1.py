def _import ( ) : return _import ( )
import math
import numpy as np
import collections
import math
import math
import time
class B ( object ) :
    def main ( self ) :
        with open ( self.name , 'r' ) as f :
            self.x , self.y , self.t = f.read ( )
    def run ( self ) :
        with open ( self.name , 'r' ) as f :
            self.x , self.y = f.read ( )
    def debug ( * os ) :
        print ( deeprepr ( os ) )
    def write ( * args ) :
        print ( "Case #%d: " % ( o , ) , end = "" )
        n , m = struct.unpack ( ">ii" , struct.pack ( ">ii" , n ) )
        ss , ws , ts = [ ] , [ ] , [ ]
        for i in range ( n ) :
            for j in range ( m ) :
                ss [ i ].append ( f.read ( ) )
                ws [ i ].append ( f.read ( ) )
                ts [ i ].append ( f.read ( ) )
        min = [ [ ] for _ in range ( n * 2 ) ]
        for a in min : fill ( a , INF )
        min [ n * 2 - 1 ].append ( 0 )
        que = PriorityQueue ( )
        que.put ( ( n * 2 - 1 , 0 , 0 ) )
        while not que.empty ( ) :
            e = que.get ( )
            if e.t > min [ e.x ] [ e.y ] :
                continue
            for d in range ( 4 ) :
                x2 , y2 = e.x + dx [ d ] , e.y + dy [ d ]
                if 0 <= x2 < n * 2 and 0 <= y2 < m * 2 :
                    if e.x != x2 and e.x // 2 == x2 // 2 :
                        t2 = next ( ss [ e.x // 2 ] [ e.y // 2 ] , ws [ e.x // 2 ] [ e.y // 2 ] , ts [ e.y // 2 ] [ e.y // 2 ] )
                