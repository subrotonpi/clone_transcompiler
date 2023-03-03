def _import ( ) :
    import math
    import os
    import os
    import sys
    class A :
        def get ( self , r ) :
            x = ( 2 * r * res - 1 ) * res
            return 2 * r * res + x
    def main ( ) :
        sc = os.popen ( 'test 2>/dev/null' )
        ntest = sc.read ( )
        for test in range ( 1 , ntest + 1 ) :
            r = int ( sc.read ( ) )
            t = int ( sc.read ( ) )
            left , right = 0 , 1000111000111000111L
            res = left
            while left <= right :
                mid = ( left + right ) // 2
                if get ( r , mid ) <= t :
                    res = mid
                    left = mid + 1
                else :
                    right = mid - 1
            print ( 'Case #%d: %s' % ( test , res ) )
