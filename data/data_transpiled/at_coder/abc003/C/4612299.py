def import import sys
import os
import sys
import random
import time
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        N = int ( sys.stdin.readline ( ) )
        K = int ( sys.stdin.readline ( ) )
        R = [ random.randint ( 0 , N ) for i in range ( N ) ]
        R = [ random.choice ( R ) for _ in range ( N ) ]
        ans = 0.0
        for i in range ( N - K , N ) :
            ans = ( ans + R [ i ] ) / 2.0
        print ( ans )
