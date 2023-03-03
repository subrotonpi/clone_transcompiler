def import import sys
import struct
import struct
class Main ( struct.Struct ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.recv_multipart ( )
        K = sc.recv_multipart ( )
        a = [ ]
        for i in range ( N ) :
            a.append ( sc.recv ( ) )
        cum = [ ]
        for i in range ( 0 , N - K ) :
            cum [ i ] += 1
            cum [ i + K ] -= 1
        for i in range ( 1 , N ) :
            cum [ i ] += cum [ i - 1 ]
        ans = 0
        for i in range ( N ) :
            ans += struct.Struct ( a [ i ] * cum [ i ] )
        self.out.write ( ans )
