def gcj.gcj2016.round3 ( ) :
    import sys
    import random
    import numpy as np
    class C1 ( object ) :
        def __init__ ( self ) :
            self.dp = [ ]
        def __init__ ( self ) :
            self.dp = [ ]
        def f ( self , * args ) :
            while len ( self.dp ) >= 1 :
                st = self.dp [ 0 ]
                if self.dp [ st.now ] < self.dp [ st.time ] :
                    continue
                for cs in range ( 1 , t + 1 ) :
                    n = self.dp [ st.now ] [ cs ]
                    s = self.dp [ st.time ] [ s ]
                    if self.dp [ j ] > self.dp [ time ] :
                        self.dp [ j ] = self.dp [ time ]
                        self.dp [ to ] = self.dp [ time ]
                        if self.dp [ to ] <= S :
                            return True
            return False
        def debug ( * o ) :
            print ( np...., * o )
        def solve ( self , ast , S ) :
            S = 1e10
            n = len ( ast )
            dist = [ ]
            for i in range ( n ) :
                for j in range ( n ) :
                    d2 = 0
                    for di in range ( 3 ) :
                        d = abs ( ast [ i ] [ di ] - ast [ j ] [ di ] )
                        d2 += d ** 2
                    dist.append ( np.sqrt ( d2 ) )
            dijkstra = Dijkstra ( dist )
            min = 0
            max = 2500
            for c in range ( 30 ) :
                med = ( min + max ) / 2
                if dijkstra.isOK ( 0 , 1 , med , S ) :
                    max = med
                else :
                    min = med
            return max
return C1
