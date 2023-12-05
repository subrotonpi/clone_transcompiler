def main ( ) :
    import sys
    import random
    import time
    import math
    class B ( object ) :
        def __init__ ( self ) :
            self.T = int ( sys.stdin.read ( ) )
    for zz in range ( 1 , T + 1 ) :
        N = int ( sys.stdin.read ( ) )
        K = int ( sys.stdin.read ( ) )
        sum = [ random.randint ( 0 , N - K + 1 ) for _ in range ( N - K + 1 ) ]
        diff = [ 0 ] * N
        A = [ 0 ] * K
        B = [ 0 ] * K
        for i in range ( N + 1 , len ( sum ) ) :
            d = sum [ i + 1 ] - sum [ i ]
            diff [ i + K ] = diff [ i ] + d
            A [ i % K ] = min ( A [ i % K ] , diff [ i + K ] )
            B [ i % K ] = max ( B [ i % K ] , diff [ i + K ] )
        total = 0
        for i in range ( K ) :
            total -= A [ i ]
            B [ i ] -= A [ i ]
            A [ i ] = 0
        B [ 0 ] = B [ 0 ] - total
        d = ( ( d % K ) + K ) % K
        if d < 0 or d >= K :
            raise RuntimeError
        for ans in B [ K - 1 ] :
            less = 0
            for b in B :
                less += ans - b
            if less >= d :
                print ( 'Case #%d: %d\n' % ( zz , ans ) )
                break
