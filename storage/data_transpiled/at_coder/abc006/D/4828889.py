def import _np
import os
import sys
import numpy
from numpy.core import max
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        n = sc.nextInt ( )
        x = [ ]
        for i in range ( n ) :
            x.append ( sc.nextInt ( ) )
        print ( n - get_LIS_2 ( n , x ) )
    def get_LIS ( self , n , a ) :
        dp = [ 0 ] * ( n + 1 )
        dp [ 0 ] = 1
        ans = 1
        for i in range ( n ) :
            dp [ i ] = 1
            for j in range ( i ) :
                if a [ j ] < a [ i ] :
                    dp [ i ] = max ( dp [ i ] , dp [ j ] + 1 )
            ans = max ( ans , dp [ i ] )
        return ans
    def get_LIS_2 ( self , n , a ) :
        INF = numpy.finfo ( numpy.float32 ).eps
        dp = [ INF ] * ( n + 2 )
        dp [ 0 ] = - INF
        for i in range ( n ) :
            x = a [ i ]
            lower = 0
            upper = self.n + 1
            dp [ i ] = 1
            while lower < upper :
                mid = ( lower + upper ) // 2
                if dp [ mid ] > x :
                    dp [ mid ] = x
                    upper = mid
                else :
                    lower = mid + 1
            dp [ len ( dp ) ] = x
        for i in range ( self.n ) :
            if dp [ i ] != INF :
                return i
        return 1
