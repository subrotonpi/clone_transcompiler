def main ( ) :
    import sys
    from numpy import array
    from numpy import arange , zeros , array
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = int ( sys.argv [ 1 ] )
            self.C = int ( sys.argv [ 2 ] )
            self.mod = long ( 1e9 ) + 7
            A = array ( [ 0 ] )
            B = array ( [ 1 ] )
            K = array ( [ [ 0 ] * ( N + 1 ) for i in range ( 401 ) ] )
            for i in range ( 401 ) :
                K [ i ] [ 0 ] = 1
                for j in range ( 1 , 401 ) :
                    K [ i ] [ j ] = ( K [ i ] [ j - 1 ] * long ( i ) ) % mod
            for i in range ( 1 , 401 ) :
                for j in range ( 401 ) :
                    K [ i ] [ j ] = ( K [ i - 1 ] [ j ] + K [ i ] [ j ] ) % mod
    for i in range ( N ) :
        A [ i ] = array ( [ 0 ] )
    for i in range ( N ) :
        B [ i ] = array ( [ 0 ] )
    dp = zeros ( ( N + 1 , C + 1 ) )
    dp [ 0 ] [ 0 ] = 1
    for i in range ( N ) :
        for c in range ( 0 , C + 1 ) :
            for k in range ( 0 , c + 1 ) :
                dp [ i + 1 ] [ c ] = ( dp [ i + 1 ] [ c ] + ( ( ( K [ int ( B [ i ] ) ] [ k ] - K [ int ( A [ i ] - 1 ] [ k ] + mod ) % mod ) * dp [ i ] [ c - k ] ) % mod ) % mod ) % mod
    print ( dp [ N ] [ C ] )
