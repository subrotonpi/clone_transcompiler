def import import os
import sys
import math
import random
import time
mod = 1000000000 + 7
class Main ( object ) :
    def __init__ ( self ) :
        self.mod = 1000000000 + 7
    def __call__ ( self , f ) :
        with open ( "/proc/self/" + f , "r" ) as sc :
            n , m = sc.read ( ).split ( " " )
            f = [ i for i in range ( 2 , n + 1 ) ]
            dp , sum = [ 0 ] * n , [ 1 ] * n
            dp [ 1 ] , dp [ 2 ] = dp [ 1 ] , dp [ 2 ] = 1 , 2
            start = 2
            vis = set ( [ f [ 2 ] ] )
            for end in range ( 3 , n + 1 ) :
                if vis.add ( f [ end ] ) :
                    dp [ end ] = ( sum [ end - 1 ] - sum [ start - 2 ] + mod ) % mod
                else :
                    while start < end and f [ start ] != f [ end ] :
                        vis.discard ( f [ start ] )
                        start += 1
                    if start + 1 == end :
                        dp [ end ] = dp [ start ]
                    else :
                        dp [ end ] = ( sum [ end - 1 ] - sum [ start - 1 ] + mod ) % mod
                        start += 1
            sum [ end ] = ( sum [ end - 1 ] + dp [ end ] ) % mod
        print ( dp [ n + 1 ] )
