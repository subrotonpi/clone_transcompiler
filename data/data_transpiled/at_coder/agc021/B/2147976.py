def import import os
import math
import math
import os
import math
import math
import math
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        n = sc.recv_handle ( )
        x = [ ]
        y = [ ]
        for i in range ( n ) :
            x.append ( sc.recv_handle ( ) )
            y.append ( sc.recv_handle ( ) )
    def main ( ) :
        s = [ ]
        for i in range ( n ) :
            if i != j :
                s.append ( math.atan2 ( y [ j ] - y [ i ] , x [ j ] - x [ i ] ) )
        s.sort ( )
        max = 0
        for j in range ( n - 2 ) :
            max = max ( s [ j + 1 ] - s [ j ] , max )
        max = max ( max , 2 * math.pi - ( s [ n - 2 ] - s [ 0 ] ) )
        print ( max ( ( max - math.pi ) / 2 / math.pi , 0 ) )
