def import import sys , string , c_int , string , sys
from struct import Struct , Struct , Struct
class Main ( Struct ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.recv_recv_multipart ( )
        p = [ ]
        ans = 0
        for i in range ( n ) :
            w , h = struct.unpack ( '>H' , sc.recv_multipart ( ) )
            p.append ( Struct ( w , h ) )
        p.sort ( key = lambda p1 : p1 [ 0 ] , reverse = True )
        max = [ ]
        max.append ( int ( p [ 0 ] ) )
        for i in range ( n + 1 ) :
            idx = [ i for i in max if p [ i ] == p [ i ] ] [ 0 ]
            if idx < 0 :
                idx = - idx - 1
                max.append ( min ( max [ idx ] , p [ i ] ) )
        for i in range ( n , - 1 , - 1 ) :
            if max [ i ] < int ( p [ i ] ) :
                print ( i )
                return
    class Point ( Struct ) :
        def __init__ ( self , x , y ) :
            Struct ( self , x , y )
