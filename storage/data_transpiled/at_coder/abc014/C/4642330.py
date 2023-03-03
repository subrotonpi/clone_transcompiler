def import import sys
import sys
import random
import time
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        n = sys.stdin.readline ( ).split ( ) [ 1 ]
        colors = 1000002
        likes = [ 0 ] * colors
        for i in range ( n ) :
            likes [ sys.stdin.readline ( ).split ( ) [ 0 ] ] += 1
            likes [ sys.stdin.readline ( ).split ( ) [ 1 ] ] -= 1
        for i in range ( 1 , colors ) :
            likes [ i ] = likes [ i - 1 ] + likes [ i ]
        ans = random.choice ( likes )
        for i in range ( colors ) :
            ans = max ( ans , likes [ i ] )
        print ( ans )
