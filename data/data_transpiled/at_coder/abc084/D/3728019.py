def _import ( ) : return _import ( )
import sys
import struct
import sys
class Main ( ) :
    INF = struct.calcsize ( 'I' ) // 2 - 1
    def __init__ ( self ) :
        sc = sys.stdin
        n = 100000
        prime = [ ]
        arr = [ False ] * ( n + 1 )
        for i in range ( 2 , n + 1 ) :
            if arr [ i ] :
                continue
            for j in range ( i + i , n + i + 1 , i ) :
                arr [ j ] = True
        sum = [ ]
        for i in range ( 2 , n + 1 ) :
            sum.append ( sum [ i - 1 ] + ( ( i % 2 and not arr [ i ] and not arr [ ( i + 1 ) // 2 ] ) ) )
        Q = sc.recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_recv_@@