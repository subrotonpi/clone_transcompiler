def _import ( ) :
    import math
    import numpy as np
    import os
    import os
    import sys
    class C :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.eps = 1e-9
        def __eq__ ( self , d ) :
            self.N = self.N
            self.S = self.S
            X = np.array ( [ self.X , self.Y , self.Z ] )
            Y = np.array ( [ self.Y , self.Z , self.VX ] )
            Z = np.array ( [ self.VY , self.VY ] )
            g = np.zeros ( ( self.N , self.N , self.S ) )
            for i in range ( self.N ) :
                for j in range ( i + 1 , self.N ) :
                    g [ i ] [ j ] = g [ j ] [ i ] = math.sqrt ( dist2 ( X [ i ] - X [ j ] , Y [ i ] - Y [ j ] , Z [ i ] - Z [ j ] ) )
            left = right = 10000
            for i in range ( self.N ) :
                mid = ( left + right ) / 2
                if self.ok ( mid ) :
                    right = mid
                else :
                    left = mid
            return right
        def ok ( d ) :
            pos = [ ]
            visited = [ True ]
            pos.append ( 0 )
            for i in range ( self.N ) :
                if self.visited [ i ] :
                    return True
            return False
    C._import ( C )
    return C
