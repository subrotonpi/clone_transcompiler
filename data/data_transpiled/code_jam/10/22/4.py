def test_x ( ) :
    import sys
    import random
    import time
    class x ( object ) :
        def __init__ ( self ) :
            self.t = t
    for tt in range ( 1 , t + 1 ) :
        n , k = [ int ( i ) for i in range ( n ) ]
        b , T = [ int ( i ) for i in range ( n ) ]
        x , v = [ int ( i ) for i in range ( n ) ]
        good , bad , swaps = 0 , 0 , 0
        for i in range ( n - 1 , 0 , k - 1 ) :
            if b - x [ i ] <= T * v [ i ] :
                good += 1
                swaps += bad
            else :
                bad += 1
        if good < k :
            print ( "Case #{}: {}IMPOSSIBLE".format ( tt , "IMPOSSIBLE" ) )
        else :
            print ( "Case #{}: {}".format ( tt , swaps ) )
