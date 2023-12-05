def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
    def __init__ ( self ) :
        self.A = sys.maxint
        self.B = sys.maxint
        self.C = sys.maxint
        self.D = sys.maxint
        for plus in range ( self.N ) :
            minus = ( self.N - plus )
            max = A + D * plus - C * minus
            min = A + C * plus - D * minus
            if min <= B <= max :
                print ( "YES" )
                return
        print ( "NO" )
