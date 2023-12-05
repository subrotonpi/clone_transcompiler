def rnd1B ( ) :
    import os
    import sys
    import os
    import sys
    import os
    import sys
    import math
    import os
    import os
    import sys
    import os
    import sys
    import os
    import sys
    import os
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import tempfile
    class FallingDiamonds ( subprocess ) :
        def __init__ ( self ) :
            self.res_X , self.res_Y = None , None
        def exist ( self , i , j ) :
            for k in range ( len ( self.X ) ) :
                if self.X [ k ] == i and self.Y [ k ] == j : return True
            return False
        def rec ( self , index , x , y , p ) :
            if index == - 1 :
                can = False
                for j in range ( len ( self.X ) ) :
                    can |= self.X [ j ] == self.res_X and self.Y [ j ] == self.res_Y
                if can :
                    ans += p
                return
            if y == 0 :
                self.X [ index ] = x
                self.Y [ index ] = y
                self.rec ( index - 1 , 0 , 50 , p )
                return
            if not self.exist ( x , y - 2 ) and y != 1 :
                self.rec ( index , x , y - 1 , p )
            else :
                left = self.exist ( x - 1 , y - 1 )
                right = self.exist ( x + 1 , y - 1 )
                if left and right :
                    self.X [ index ] = x
                    self.Y [ index ] = y
                    self.rec ( index - 1 , 0 , 50 , p )
                elif left :
                    self.rec ( index , x + 1 , y - 1 , p )
                elif right :
                    self.rec ( index , x - 1 , y - 1 , p )
                else :
                    self.rec ( index , x + 1 , y - 1 , p * 0.5 )
                    self.rec ( index , x - 1 , y - 1 , p * 0.5 )
        self.X [ index ] = Y [ index ] = - 10
