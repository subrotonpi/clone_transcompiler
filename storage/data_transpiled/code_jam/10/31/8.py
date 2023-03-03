def gao ( a , b ) :
    import os
    import sys
    from numpy.linalg import solve
    class AA ( object ) :
        def __init__ ( self , a , b ) :
            self.a = a
            self.b = b
            self.n = len ( a )
            self.t = 0
            for i in range ( self.n ) :
                for j in range ( i + 1 , self.n ) :
                    if ( a [ i ] - a [ j ] ) * ( b [ i ] - b [ j ] ) < 0 :
                        self.t += 1
    return AA
