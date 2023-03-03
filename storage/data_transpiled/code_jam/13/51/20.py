def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.solve ( )
        def solve ( B , N , arr ) :
            ret = 0.0
            arr.sort ( )
            for i in range ( 1 , 37 ) :
                hi = int ( N ) / 1000
                lo = arr [ i - 1 ]
                for i in range ( 100 ) :
                    mid = ( hi + lo ) / 2
                    if self.valid ( B , i , arr , mid ) :
                        lo = mid
                        ret = max ( ret , self.score ( B , i , arr , mid ) )
                    else :
                        hi = mid
            return ret
        def score ( B , K , arr , req ) :
            use = self.count ( B , K , arr , req )
            pay = 0
            for i in range ( K ) :
                pay += ( req - arr [ i ] )
            pay *= 36
            pay /= K
            return pay - use
        def count ( B , K , arr , req ) :
            use = 0
            for i in range ( 37 ) :
                if i < K :
                    use += ( req - arr [ i ] )
                else :
                    if arr [ i ] < req + 1 :
                        use += ( req + 1 - arr [ i ] )
            return use
        def valid ( B , K , arr , req ) :
            use = self.count ( B , K , arr , req )
            if use > B :
                return False
            return True
        def solve ( ) :
            with open ( "input.txt" , "r" ) as cin :
                T = cin.read ( )
                for C in range ( 1 , T + 1 ) :
                    B , N = cin.read ( )
                    arr = [ ]
                    for i in range ( 37 ) :
                        arr.append ( cin.read ( ) )
                    print ( "Case #{}: {}".format ( C , solve ( B , N , arr ) ) )
    return Main ( )
