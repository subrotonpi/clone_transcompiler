def import import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( )
        K = sc.readline ( )
        ans = K * math.pow ( K - 1 , N - 1 )
        print ( int ( ans ) )
