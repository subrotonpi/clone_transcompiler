def import import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        a = [ ]
        sum = 0
        for i in range ( N ) :
            a.append ( sc.readline ( ).strip ( ) )
            sum += a [ i ]
        left , right = a [ 0 ] , sum - a [ 0 ]
        min = abs ( left - right )
        for i in range ( 1 , N - 1 ) :
            left += a [ i ]
            right -= a [ i ]
            if abs ( left - right ) < min :
                min = abs ( left - right )
        print ( min )
