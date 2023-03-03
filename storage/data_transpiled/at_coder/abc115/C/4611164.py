def import import sys
import random
import time
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        N = sys.stdin.readline ( ).split ( ) [ 0 ]
        K = sys.stdin.readline ( ).split ( ) [ 1 ]
        h = [ random.randrange ( N ) for _ in range ( N ) ]
        h.sort ( )
        min = h [ 0 ]
        max = h [ K - 1 ]
        diff = max - min
        for i in range ( K , N ) :
            min = h [ i - K + 1 ]
            max = h [ i ]
            diff = min ( diff , max - min )
        print ( diff )
