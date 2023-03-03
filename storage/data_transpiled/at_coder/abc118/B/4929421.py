def import import _strptime
import time
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        data = sc.readline ( ).split ( )
        N = int ( data [ 0 ] )
        M = int ( data [ 1 ] )
        food = [ 0 for i in range ( M ) ]
        for i in range ( N ) :
            data = sc.readline ( ).split ( )
            K = int ( data [ 0 ] )
            for j in range ( 1 , K + 1 ) :
                value = int ( data [ j ] )
                food [ - 1 ] += value
        cnt = 0
        for i in range ( M ) :
            if food [ i ] == N :
                cnt += 1
        print ( cnt )
