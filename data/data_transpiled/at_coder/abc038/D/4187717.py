def main ( ) :
    import sys
    from numpy import arange
    from numpy.core import zeros
    from numpy.core import copy_reg
    from numpy.core import copy_reg
    from numpy.core import copy_reg
    from numpy.core import copy_reg
    from numpy.core import copy_reg
    from numpy.core import copy_reg
    from numpy.core import copy_reg
    from numpy.core import copy_reg
    from numpy.core import copy_reg
    N = copy_reg.shape [ 0 ]
    boxes = [ ( x [ 0 ] , x [ 1 ] ) for x in copy_reg.shape [ 1 : ] ]
    boxes = [ ( x [ 0 ] , x [ 1 ] ) for x in boxes ]
    boxes.sort ( lambda b1 , b2 : cmp ( b1 [ 1 ] , b2 [ 1 ] ) )
    dp = [ INF ] * N
    for i in range ( N ) :
        dp [ i ] = INF
    for i in range ( N ) :
        dp [ upperBound ( dp , boxes [ i ] [ 1 ] ) + 1 ] = boxes [ i ] [ 1 ]
    print ( upperBound ( dp , INF ) + 1 )
    def upperBound ( a , k ) :
        left = - 1
        right = len ( a )
        while right - left > 1 :
            mid = ( left + right ) // 2
            if a [ mid ] < k :
                left = mid
            else :
                right = mid
        return left
    class Box ( object ) :
        def __init__ ( self , w = 0 , h = 0 ) :
            self.w = w
            self.h = h
        def __init__ ( self , w = 0 , h = 0 ) :
            self.w = w
            self.h = h
