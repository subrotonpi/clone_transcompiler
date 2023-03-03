def import sys
class Main ( object ) :
    def __init__ ( self ) :
        with open ( "/proc/net/dev/null" , "r" ) as sn :
            N = sn.read ( )
            K = sn.read ( )
            if N > K :
                print ( nCr ( N + K - 1 , K ) )
                return
            c = K % N
            r = N - c
            print ( nCr ( N , r ) )
    def nCr ( n , r ) :
        M = 1000000007L
        dp = [ [ 0 for i in range ( 502 ) ] for j in range ( 502 ) ]
        dp [ 0 ] [ 0 ] = 1
        for i in range ( 1 , n + 1 ) :
            dp [ i ] [ 0 ] = 1
            for j in range ( 1 , i + 1 ) :
                dp [ i ] [ j ] = ( dp [ i - 1 ] [ j - 1 ] + dp [ i - 1 ] [ j ] ) % M
        return dp [ n ] [ r ]
