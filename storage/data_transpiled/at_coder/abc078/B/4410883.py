def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        N = self.N
        Y = self.Y
        Z = self.Z
        ans = 0
        while ( ans + 1 ) * ( Y + Z ) + Z <= N :
            ans += 1
        print ( ans )
