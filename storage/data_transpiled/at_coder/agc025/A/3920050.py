def import import sys
import os
import sys
import sys
class Main ( object ) :
    def __init__ ( self ) :
        with open ( sys.argv [ 1 ] ) as sc :
            n = sc.read ( )
    def help ( p ) :
        ans = sys.maxint
        for i in range ( 1 , n // 2 + 1 ) :
            ans = min ( ans , help ( i ) + help ( n - i ) )
        print ( ans )
    def help ( p ) :
        ans = 0
        while p > 0 :
            ans += p % 10
            p //= 10
        return ans
