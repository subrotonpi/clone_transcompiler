def import import sys
import random
import time
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        N = int ( sys.stdin.readline ( ) )
        candidates = [ ]
        tmp = 1
        while tmp <= N :
            candidates.append ( int ( tmp ) )
            tmp *= 6
        tmp = 1
        while tmp <= N :
            candidates.append ( int ( tmp ) )
            tmp *= 9
        INF = 1_000_000
        dp = [ INF ] * ( N + 1 )
        dp [ 0 ] = 0
        for i in range ( 1 , N + 1 ) :
            for n in candidates :
                if i >= n :
                    dp [ i ] = min ( dp [ i ] , dp [ i - n ] + 1 )
        out.write ( dp [ N ] )
