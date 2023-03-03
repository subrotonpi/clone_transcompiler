def _ ( ) : return sys.maxsize
import os
import os
import sys
import time
import sys
import sys
import heapq
import time
import time
import time
import sys
class DJSet ( object ) :
    def __init__ ( self , n_ ) :
        self.n = n_
        self.upper = [ - 1 ]
        self.upper = [ ]
    def equiv ( x , y ) :
        return self.upper [ x ] < 0
    def setUnion ( x , y ) :
        self.id = [ x , y ]
        self.cost = y
    def tr ( * objects ) :
        print ( [ x , y ] )
    def __repr__ ( self ) :
        return repr ( self.cost )
    NIL = time.time ( )
    def run ( ) :
        with open ( '/proc/%d/%d' % ( sys.stdin.fileno ( ) , sys.stdin.fileno ( ) ) ) as sc :
            n = sc.readline ( )
            ds = DJSet ( n )
            lis = [ [ ( x , i ) for i in range ( 2 ) ] for x in sc.read ( ) ]
            lis [ 0 ].append ( [ ( x , i ) for i in range ( 2 ) ] )
            lis [ 1 ].append ( [ ( y , i ) for i in range ( 2 ) ] )
            ref = [ ]
            lis.sort ( key = lambda x : int ( x [ 0 ] ) )
            lis.sort ( key = lambda x : int ( x [ 1 ] ) )
            ref.sort ( key = lambda x : int ( x [ 0 ] ) )
            ans = 0
            while not pq.empty ( ) :
                e = pq.poll ( )
                if ds.equiv ( e.id [ 0 ] , e.id [ 1 ] ) :
                    continue
                ans += e.cost
                ds.setUnion ( e.id [ 0 ] , e.id [ 1 ] )
        print ( ans )
