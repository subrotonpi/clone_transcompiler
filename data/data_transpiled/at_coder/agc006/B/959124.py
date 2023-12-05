def import import sys
import os
import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
        self.x = sys.maxint
        print ( x , end = "" )
    def print ( self , n ) :
        max = self.n * 2 - 1
        if self.x == 1 or self.x == max :
            print ( "No" )
            return
        print ( "Yes" )
        sep = os.linesep
        ans = string.join ( [ ( e % max + 1 ) + sep for e in range ( x + n - 1 , x + n + max - 1 ) ] )
        print ( ans )
