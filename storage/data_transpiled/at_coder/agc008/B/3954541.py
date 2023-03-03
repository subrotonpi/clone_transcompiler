def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n , self.K = sys.argv [ 1 ] , sys.argv [ 2 ]
            sum , a , posi = [ 0 ] * ( n + 1 ) , [ 0 ] * ( n + 1 ) , [ 0 ] * ( n + 1 )
            for i in range ( 1 , n + 1 ) :
                a [ i ] = sys.argv [ i ]
                sum [ i ] = sum [ i - 1 ] + a [ i ]
                posi [ i ] = posi [ i - 1 ] + max ( 0 , a [ i ] )
    ans = 0
    for start in range ( 1 , start + K - 1 , n + 1 ) :
        end = start + K - 1
        cur = max ( 0 , sum [ end ] - sum [ start - 1 ] )
        cur += posi [ start - 1 ] + posi [ n ] - posi [ end ]
        ans = max ( ans , cur )
    print ( ans )
