def import import _re
import sys
import re
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
        N = Scanner ( ).__next__
        x = Scanner ( ).__next__
        arr = [ ]
        for i in range ( N ) :
            arr.append ( _re.search ( x ) )
        count = 0
        for i in range ( N ) :
            if arr [ i ] > x :
                count += arr [ i ] - x
                arr [ i ] = x
        for i in range ( 1 , N ) :
            if arr [ i ] + arr [ i - 1 ] > x :
                count += arr [ i ] + arr [ i - 1 ] - x
                arr [ i ] = x - arr [ i - 1 ]
        print ( count )
