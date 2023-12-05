def _main ( ) :
    import os
    import math
    import os
    import math
    import os
    import time
    class C :
        def __init__ ( self , x , y ) :
            self.x = x
            self.y = y
        def create ( self , x_diff , y_diff ) :
            for case_num in range ( 1 , num_cases + 1 ) :
                N = self.x
                X = [ ]
                Y = [ ]
                for i in range ( 1 , num_cases + 1 ) :
                    temp = b
                    b = a % b
                if x != y :
                    return False
                else :
                    if y < 0 :
                        return False
                else :
                    return True
        def __repr__ ( self ) :
            return "Direction [x=%d, y=%d]" % ( self.x , self.y )
        def gcd ( self , x ) :
            return 1
        def gcd ( self , y ) :
            return gcd ( self , x )
        def quadrant ( self , y ) :
            if x >= 0 :
                return 0
            else :
                return 4
        def opposite ( self , x ) :
            return self.x
    def solve ( self , X , Y , i ) :
        if N <= 3 :
            return 0
        directions = [ ]
        for j in range ( N ) :
            if j == i :
                continue
            directions.append ( Direction ( X [ j ] - X [ i ] , Y [ j ] - Y [ i ] ) )
        directions.sort ( )
        min = N
        oppindex = 0
        target = directions [ 0 ].opposite ( )
        while oppindex < len ( directions ) and in_left_half_plane ( directions [ 0 ] , directions [ oppindex ] ) :
            oppindex += 1
        if oppindex == len ( directions ) :
            return 0
        min = min ( min , oppindex - 1 )
        if min == 0 :
            return 0
        for j in range ( 1 , len ( directions ) ) :
            for k in directions :
                if in_left_half_plane ( directions [ j ] , directions [ oppindex ] ) :
                    oppindex = ( oppindex + 1