def import __main__
class Main ( object ) :
    def __init__ ( self ) :
        self.mod = 1000000000 + 7
    def __call__ ( self ) :
        sc = sys.stdin
        W = sc.read ( )
        n = sc.read ( )
        K = sc.read ( )
        a = [ sc.read ( ) for i in range ( 1 , n + 1 ) ]
        b = [ sc.read ( ) for i in range ( n + 1 ) ]
        sum_b = 0
        for w in b : sum_b += w
        dp = [ [ 0 ] * ( K + 1 ) for i in range ( K + 1 ) ]
        dp [ 0 ] [ 0 ] = 0
        for kind in range ( 1 , n + 1 ) :
            for k in range ( K - 1 , - 1 , - 1 ) :
                for sum in range ( sum_b , b [ kind ] , - 1 ) :
                    if dp [ k ] [ sum - b [ kind ] ] + a [ kind ] <= W :
                        dp [ k + 1 ] [ sum ] = min ( dp [ k + 1 ] [ sum ] , dp [ k ] [ sum - b [ kind ] ] + a [ kind ] )
    ans = - 1
    for k in range ( 0 , K ) :
        for sum in range ( 0 , sum_b ) :
            if dp [ k ] [ sum ] <= W :
                ans = max ( sum , ans )
    print ( ans )
