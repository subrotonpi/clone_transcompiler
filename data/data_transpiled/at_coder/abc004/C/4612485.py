def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
        N = sys.stdin.read ( )
        N %= 30
        arr = [ 1 , 2 , 3 , 4 , 5 , 6 ]
        for i in range ( N ) :
            j1 = i % 5
            j2 = i % 5 + 1
            tmp = arr [ j1 ]
            arr [ j1 ] = arr [ j2 ]
            arr [ j2 ] = tmp
        yield num
