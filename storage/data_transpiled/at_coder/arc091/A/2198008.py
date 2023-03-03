def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = int ( sc.readline ( ) )
        m = int ( sc.readline ( ) )
        ret = 0
        if n > 1 and m > 1 :
            ret = ( n - 2 ) * ( m - 2 )
        elif n == 1 and m == 1 :
            ret = 1
        else :
            ret = max ( n , m ) - 2
        print ( ret )
        sc.close ( )
