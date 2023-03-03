def import import sys
class C ( object ) :
    def __init__ ( self ) :
        self.T = len ( sys.stdin )
        for t in range ( T ) :
            x = solve ( )
            print ( "Case #%d: %d %d" % ( t + 1 , x [ 0 ] , x [ 1 ] ) )
    def log2 ( n ) :
        return 63L - len ( str ( n ) )
    def solve ( k , n ) :
        if k == 1 :
            return [ n // 2 , ( n - 1 ) // 2 ]
        m = 1 << log2 ( k )
        x = ( k - m ) | ( m >> 1 )
        p = solve ( x , n )
        if ( k & ( m >> 1 ) ) == 0 :
            v = p [ 0 ]
        else :
            v = p [ 1 ]
        return [ v // 2 , ( v - 1 ) // 2 ]
    def solve ( ) :
        N = sys.stdin.read ( )
        K = sys.stdin.read ( )
        return solve ( K , N )
