def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        a = sys.stdin.read ( )
        b = sys.stdin.read ( )
        if a <= 0 and 0 <= b :
            self.out.write ( "Zero" )
        elif b < 0 :
            nega_num = b - a + 1
            if nega_num % 2 == 1 :
                self.out.write ( "Negative" )
            else :
                self.out.write ( "Positive" )
        else :
            self.out.write ( "Positive" )
